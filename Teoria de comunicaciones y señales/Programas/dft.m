function varargout = dft(varargin)
% DFT MATLAB code for dft.fig
%      DFT, by itself, creates a new DFT or raises the existing
%      singleton*.
%
%      H = DFT returns the handle to a new DFT or the handle to
%      the existing singleton*.
%
%      DFT('CALLBACK',hObject,eventData,handles,...) calls the local
%      function named CALLBACK in DFT.M with the given input arguments.
%
%      DFT('Property','Value',...) creates a new DFT or raises the
%      existing singleton*.  Starting from the left, property value pairs are
%      applied to the GUI before dft_OpeningFcn gets called.  An
%      unrecognized property name or invalid value makes property application
%      stop.  All inputs are passed to dft_OpeningFcn via varargin.
%
%      *See GUI Options on GUIDE's Tools menu.  Choose "GUI allows only one
%      instance to run (singleton)".
%
% See also: GUIDE, GUIDATA, GUIHANDLES

% Edit the above text to modify the response to help dft

% Last Modified by GUIDE v2.5 31-May-2016 06:58:39

% Begin initialization code - DO NOT EDIT
gui_Singleton = 1;
gui_State = struct('gui_Name',       mfilename, ...
                   'gui_Singleton',  gui_Singleton, ...
                   'gui_OpeningFcn', @dft_OpeningFcn, ...
                   'gui_OutputFcn',  @dft_OutputFcn, ...
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


% --- Executes just before dft is made visible.
function dft_OpeningFcn(hObject, eventdata, handles, varargin)
% This function has no output args, see OutputFcn.
% hObject    handle to figure
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)
% varargin   command line arguments to dft (see VARARGIN)

% Choose default command line output for dft
handles.output = hObject;

% Update handles structure
guidata(hObject, handles);

% UIWAIT makes dft wait for user response (see UIRESUME)
% uiwait(handles.figure1);


% --- Outputs from this function are returned to the command line.
function varargout = dft_OutputFcn(hObject, eventdata, handles) 
% varargout  cell array for returning output args (see VARARGOUT);
% hObject    handle to figure
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)

% Get default command line output from handles structure
varargout{1} = handles.output;



function senal_Callback(hObject, eventdata, handles)
% hObject    handle to senal (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)

% Hints: get(hObject,'String') returns contents of senal as text
%        str2double(get(hObject,'String')) returns contents of senal as a double


% --- Executes during object creation, after setting all properties.
function senal_CreateFcn(hObject, eventdata, handles)
% hObject    handle to senal (see GCBO)
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
x = str2num(get(handles.senal,'String'));
    N=length(x);
k=15;
X=[x,zeros(1,30-N)]
X= X([ end-k+1:end 1:end-k ]);
xn=-15:15-1;
%Señal de entrada
axes(handles.axes1)
stem(xn,X,'c','MarkerFaceColor','blue')
ylabel('f[x]')
%Calculo de DFT
y=zeros(1,N)
for p = 0:N-1
    for n = 0:N-1
        y(p+1) = y(p+1) + x(n+1)*exp(-j*pi*2*n*p/N);
    end
end
Y=(1/N)*y;
%Z=[Y,zeros(1,30-N)]
%Z=Z([end-k+1:end 1:end-k]);
axes(handles.axes2)
%plot(Z,'*r');
%compass(Z,'b');
polar(angle(Y),abs(Y),'dr');
ylabel('f(u)')
salida=Y;
set(handles.salida,'String',num2str(salida));


% --- Executes on button press in pushbutton2.
function pushbutton2_Callback(hObject, eventdata, handles)
% hObject    handle to pushbutton2 (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)
cla;
clear;
clear global;
pulse = findobj(gcbf,'Tag','senal');
res = findobj(gcbf,'Tag','salida');

limpia='';
set(pulse,'String',limpia);
set(res,'String',limpia);

% --------------------------------------------------------------------
function salida_ButtonDownFcn(hObject, eventdata, handles)
% hObject    handle to salida (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)


% --- Executes on selection change in salida.
function salida_Callback(hObject, eventdata, handles)
% hObject    handle to salida (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)

% Hints: contents = cellstr(get(hObject,'String')) returns salida contents as cell array
%        contents{get(hObject,'Value')} returns selected item from salida


% --- Executes during object creation, after setting all properties.
function salida_CreateFcn(hObject, eventdata, handles)
% hObject    handle to salida (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    empty - handles not created until after all CreateFcns called

% Hint: listbox controls usually have a white background on Windows.
%       See ISPC and COMPUTER.
if ispc && isequal(get(hObject,'BackgroundColor'), get(0,'defaultUicontrolBackgroundColor'))
    set(hObject,'BackgroundColor','white');
end
