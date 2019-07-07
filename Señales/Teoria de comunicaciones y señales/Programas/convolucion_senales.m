function varargout = convolucion_senales(varargin)
% CONVOLUCION_SENALES MATLAB code for convolucion_senales.fig
%      CONVOLUCION_SENALES, by itself, creates a new CONVOLUCION_SENALES or raises the existing
%      singleton*.
%
%      H = CONVOLUCION_SENALES returns the handle to a new CONVOLUCION_SENALES or the handle to
%      the existing singleton*.
%
%      CONVOLUCION_SENALES('CALLBACK',hObject,eventData,handles,...) calls the local
%      function named CALLBACK in CONVOLUCION_SENALES.M with the given input arguments.
%
%      CONVOLUCION_SENALES('Property','Value',...) creates a new CONVOLUCION_SENALES or raises the
%      existing singleton*.  Starting from the left, property value pairs are
%      applied to the GUI before convolucion_senales_OpeningFcn gets called.  An
%      unrecognized property name or invalid value makes property application
%      stop.  All inputs are passed to convolucion_senales_OpeningFcn via varargin.
%
%      *See GUI Options on GUIDE's Tools menu.  Choose "GUI allows only one
%      instance to run (singleton)".
%
% See also: GUIDE, GUIDATA, GUIHANDLES

% Edit the above text to modify the response to help convolucion_senales

% Last Modified by GUIDE v2.5 28-May-2016 23:52:06

% Begin initialization code - DO NOT EDIT
gui_Singleton = 1;
gui_State = struct('gui_Name',       mfilename, ...
                   'gui_Singleton',  gui_Singleton, ...
                   'gui_OpeningFcn', @convolucion_senales_OpeningFcn, ...
                   'gui_OutputFcn',  @convolucion_senales_OutputFcn, ...
                   'gui_LayoutFcn',  [] , ...
                   'gui_Callback',   []);
if nargin && ischar(varargin{1})
    gui_State.gui_Callback = str2func(varargin{1});
end

if nargout
    [varargout{1:nargout}] = gui_mainfcn(gui_State, varargin{:});
else
    gui_mainfcn(gui_State, varargin{:});
end
% End initialization code - DO NOT EDIT


% --- Executes just before convolucion_senales is made visible.
function convolucion_senales_OpeningFcn(hObject, eventdata, handles, varargin)
% This function has no output args, see OutputFcn.
% hObject    handle to figure
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)
% varargin   command line arguments to convolucion_senales (see VARARGIN)

% Choose default command line output for convolucion_senales
handles.output = hObject;

% Update handles structure
guidata(hObject, handles);

% UIWAIT makes convolucion_senales wait for user response (see UIRESUME)
% uiwait(handles.figure1);


% --- Outputs from this function are returned to the command line.
function varargout = convolucion_senales_OutputFcn(hObject, eventdata, handles) 
% varargout  cell array for returning output args (see VARARGOUT);
% hObject    handle to figure
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)

% Get default command line output from handles structure
varargout{1} = handles.output;



function pulso_Callback(hObject, eventdata, handles)
% hObject    handle to pulso (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)

% Hints: get(hObject,'String') returns contents of pulso as text
%        str2double(get(hObject,'String')) returns contents of pulso as a double


% --- Executes during object creation, after setting all properties.
function pulso_CreateFcn(hObject, eventdata, handles)
% hObject    handle to pulso (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    empty - handles not created until after all CreateFcns called

% Hint: edit controls usually have a white background on Windows.
%       See ISPC and COMPUTER.
if ispc && isequal(get(hObject,'BackgroundColor'), get(0,'defaultUicontrolBackgroundColor'))
    set(hObject,'BackgroundColor','white');
end



function entrada_Callback(hObject, eventdata, handles)
% hObject    handle to entrada (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)

% Hints: get(hObject,'String') returns contents of entrada as text
%        str2double(get(hObject,'String')) returns contents of entrada as a double


% --- Executes during object creation, after setting all properties.
function entrada_CreateFcn(hObject, eventdata, handles)
% hObject    handle to entrada (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    empty - handles not created until after all CreateFcns called

% Hint: edit controls usually have a white background on Windows.
%       See ISPC and COMPUTER.
if ispc && isequal(get(hObject,'BackgroundColor'), get(0,'defaultUicontrolBackgroundColor'))
    set(hObject,'BackgroundColor','white');
end


% --- Executes on button press in pushbutton1.
function pushbutton1_Callback(hObject, eventdata, handles)
% hObject    handle to pushbutton1 (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)
x = str2num(get(handles.pulso,'String'));
h = str2num(get(handles.entrada,'String'));
    m=length(x);
    n=length(h);
%invierte el vector h
hi=fliplr(h);
k=20;
X=[x,zeros(1,40-m)];
X= X([ end-k+1:end 1:end-k ]);
H=[h,zeros(1,40-n)];
H= H([ end-k+1:end 1:end-k ]);
xn=-20:20-1;
Y=zeros(1,40);
p=zeros(1,40);
%Señal de impulso
axes(handles.axes1)
stem(xn,X,'blue','MarkerFaceColor','green')
ylabel('h[n]')

Hi=[hi,zeros(1,40-n)];
for i=1:40-n
p=X.*Hi;
Y(i+n-1)=sum(p);
%Señal de entrada
axes(handles.axes2);
stem(xn,Hi,'green','MarkerFaceColor','red')
ylabel('x[n]')
%Señal de salida
axes(handles.axes3);
stem(xn,Y,'green','MarkerFaceColor','blue')
xlabel('Tiempo [n]')
ylabel('y[n]')
Hi= Hi([ end 1:end-1 ]);
pause(0.2)
end
pause off
salida=Y(abs(Y)>0);
salida2=conv(x,h);
set(handles.salida,'String',num2str(salida2));



% --- Executes on button press in pushbutton2.
function pushbutton2_Callback(hObject, eventdata, handles)
% hObject    handle to pushbutton2 (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)
cla;
clear;
clear global;
pulse = findobj(gcbf,'Tag','pulso');
get = findobj(gcbf,'Tag','entrada');
res = findobj(gcbf,'Tag','salida');

limpia='';
set(pulse,'String',limpia);
set(get,'String',limpia);
set(res,'String',limpia);
