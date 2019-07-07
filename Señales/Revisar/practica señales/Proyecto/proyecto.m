
%Cebada Velazquez Luis
%Rodriguez Diego


%PROYECTO - OPERACIONES DE SEÑALES DISCRETAS

function varargout = proyecto(varargin)

gui_Singleton = 1;
gui_State = struct('gui_Name',       mfilename, ...
                   'gui_Singleton',  gui_Singleton, ...
                   'gui_OpeningFcn', @proyecto_OpeningFcn, ...
                   'gui_OutputFcn',  @proyecto_OutputFcn, ...
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

% --- Executes just before proyecto is made visible.
function proyecto_OpeningFcn(hObject, eventdata, handles, varargin)

% Choose default command line output for proyecto
handles.output = hObject;

% Update handles structure
guidata(hObject, handles);

% --- Outputs from this function are returned to the command line.
function varargout = proyecto_OutputFcn(hObject, eventdata, handles) 

% Get default command line output from handles structure
varargout{1} = handles.output;

% --- Executes on button press in btn_grabar1.
function btn_grabar1_Callback(hObject, eventdata, handles)
Fs = 11025; 
y = wavrecorder(5*Fs, Fs, 2);
axes(handles.axes1);
wavwrite(y,Fs,16,'sonido_1.wav')
plot(abs(y));


% --- Executes on button press in btn_Reproducir1.
function btn_Reproducir1_Callback(hObject, eventdata, handles)
[s f] = wavread('sonido_1.wav');
wavplay(s,f);

% --- Executes on button press in btn_reproducirRes.
function btn_reproducirRes_Callback(hObject, eventdata, handles)
[s f] = wavread('sonido_res.wav');
wavplay(s,f);

% --- Executes on button press in btn_carga_arch1.
function btn_carga_arch1_Callback(hObject, eventdata, handles)
Fs = 45000;
filename = uigetfile;
x = wavread(filename);
disp(filename);
wavwrite(x,Fs,16,'sonido_1.wav');
axes(handles.axes1);
plot(abs(x));

% --- Executes on button press in btn_reflejo.
function btn_reflejo_Callback(hObject, eventdata, handles)
[y,Fs]=wavread('sonido_1.wav');
[m,n]=size(y);
vector=[];
for var=1:m
    vector(var)=y(var,1);
end
disp(vector)
disp(m)
newv=[];
newv=fliplr(vector);
axes(handles.axes3);
wavwrite(fliplr(vector),Fs,16,'sonido_res.wav')
plot(abs(newv));
sound(fliplr(vector),Fs);


% --- Executes on button press in bnt__diezma.
function bnt__diezma_Callback(hObject, eventdata, handles)
[y,Fs]=wavread('sonido_1.wav');
[m,n]=size(y);
 factor = get(handles.diezma_txt,'String');
 borrar=str2num(factor)-1;
 aux=0;
disp(m);
disp(n);
vector=[];
for var=1:m
    vector(var)=y(var,1);
end

y=y(1:str2num(factor):m);
disp(y)
disp(m)
sound(y,Fs);
if isempty(factor)
   disp('Error: Enter Text first\n')
 else
   % Write code for computation you want to do
   disp('El valor es:')
   disp(factor)
end
wavwrite(y,Fs,16,'sonido_res.wav')
 axes(handles.axes3);
plot(abs(y));


% --- Executes on button press in btn_escalon.
function btn_escalon_Callback(hObject, eventdata, handles)
[y,Fs]=wavread('sonido_1.wav');
[m,n]=size(y);
 factor = get(handles.escalon_txt,'String');
 agregar=str2num(factor)-1;
for var=1:m
    vector(var)=y(var,1);
end
vec1=[];
cont=1;
for k = 1:m
    actual=vector(k);
    for aux=0:agregar+1
    vec1(cont)=actual;
    cont=cont+aux;
    end    
end
final=[];
aux2=1;
for k = 1:length(vec1)
    if vec1(k)~=0
    final(aux2)=vec1(k);
    aux2=aux2+1;
    end
end
disp(final)
axes(handles.axes3);
wavwrite(final,Fs,16,'sonido_res.wav')
plot(abs(final));
sound(final,Fs)
disp(m)


% --- Executes on button press in btn_lineal.
function btn_lineal_Callback(hObject, eventdata, handles)
[y,Fs]=wavread('sonido_1.wav');
[m,n]=size(y);
 factor = get(handles.lineal_txt,'String');
 agregar=str2num(factor)-1;
for var=1:m
    vector(var)=y(var,1);
end
vec1=[];
cont=1;
for k = 1:m
    actual=vector(k);
    for aux=0:agregar+1
    var1=vector(k);
    vec1(cont)=actual-((var1+actual)-((var1-actual)/(var1+actual)));
    cont=cont+aux;
    end    
end
final=[];
aux2=1;
for k = 1:length(vec1)
    if vec1(k)~=0
    final(aux2)=vec1(k);
    aux2=aux2+1;
    end
end
disp(final)
axes(handles.axes3);
plot(abs(final));
wavwrite(final,Fs,16,'sonido_res.wav')
sound(final,Fs)
disp(m)

% --- Executes on button press in btn_aCero.
function btn_aCero_Callback(hObject, eventdata, handles)
[y,Fs]=wavread('sonido_1.wav');
[m,n]=size(y);
 factor = get(handles.cero_txt,'String');
 agregar=str2num(factor)-1;
final = zeros(1,str2num(factor)*length(y));  
for k = 1:m 
final(str2num(factor)*k - agregar) = y(k); 
end
disp(final)
axes(handles.axes3);
wavwrite(final,Fs,16,'sonido_res.wav')
plot(abs(final));
sound(final,Fs)

% --- Executes on button press in btn_escalar.
function btn_escalar_Callback(hObject, eventdata, handles)
factor = get(handles.escala_txt,'String');
[y,Fs]=wavread('sonido_1.wav');
[m,n]=size(y);
vector=[];
for var=1:m
    vector(var)=y(var,1)*str2num(factor);
end
disp(vector)
disp(m)
axes(handles.axes3);
wavwrite(vector,Fs,16,'sonido_res.wav')
plot(abs(vector));
sound(vector,Fs);

% --- Executes on button press in btn_detener1.
function btn_detener1_Callback(hObject, eventdata, handles)
stop(y);

% --- Executes on button press in btn_desp.
% function btn_desp_Callback(hObject, eventdata, handles)
% factor = get(handles.desp_txt,'String');
% [y,Fs]=wavread('sonido_1.wav');
% [m,n]=size(y);
% vector=[];
% for var=1:m
%     [y,Fs] = sigshift(x,m,factor)
% end
% disp(vector)
% disp(m)
% axes(handles.axes3);
% wavwrite(vector,Fs,16,'sonido_res.wav')
% plot(abs(vector));
% sound(vector,Fs);
% 
% 



function edit15_Callback(hObject, eventdata, handles)
% hObject    handle to edit15 (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)

% Hints: get(hObject,'String') returns contents of edit15 as text
%        str2double(get(hObject,'String')) returns contents of edit15 as a double


% --- Executes during object creation, after setting all properties.
function edit15_CreateFcn(hObject, eventdata, handles)
% hObject    handle to edit15 (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    empty - handles not created until after all CreateFcns called

% Hint: edit controls usually have a white background on Windows.
%       See ISPC and COMPUTER.
if ispc && isequal(get(hObject,'BackgroundColor'), get(0,'defaultUicontrolBackgroundColor'))
    set(hObject,'BackgroundColor','white');
end



function edit16_Callback(hObject, eventdata, handles)
% hObject    handle to edit16 (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)

% Hints: get(hObject,'String') returns contents of edit16 as text
%        str2double(get(hObject,'String')) returns contents of edit16 as a double


% --- Executes during object creation, after setting all properties.
function edit16_CreateFcn(hObject, eventdata, handles)
% hObject    handle to edit16 (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    empty - handles not created until after all CreateFcns called

% Hint: edit controls usually have a white background on Windows.
%       See ISPC and COMPUTER.
if ispc && isequal(get(hObject,'BackgroundColor'), get(0,'defaultUicontrolBackgroundColor'))
    set(hObject,'BackgroundColor','white');
end
