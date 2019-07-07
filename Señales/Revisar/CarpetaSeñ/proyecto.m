function varargout = proyecto(varargin)
% PROYECTO M-file for proyecto.fig

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
% End initialization code - DO NOT EDIT


% --- Executes just before proyecto is made visible.
function proyecto_OpeningFcn(hObject, eventdata, handles, varargin)
% This function has no output args, see OutputFcn.
% hObject    handle to figure
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)
% varargin   command line arguments to proyecto (see VARARGIN)

% Choose default command line output for proyecto
handles.output = hObject;

% Update handles structure
guidata(hObject, handles);

% UIWAIT makes proyecto wait for user response (see UIRESUME)
% uiwait(handles.figure1);



% --- Outputs from this function are returned to the command line.
function varargout = proyecto_OutputFcn(hObject, eventdata, handles) 

varargout{1} = handles.output;

%BOTON DE GRABAR

% --- Executes on button press in pushbutton1.
function pushbutton1_Callback(hObject, eventdata, handles)%grabar sonido1
% hObject    handle to pushbutton1 (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)
global sonido1
global Fs %frecuencia de muestreo
global segs

Fs=44100;

segs=3;%segundos a muestrear


sonido=audiorecorder(Fs,16,1);%,'int16' sería numero de bits, 5 son los seg.

disp('Grabando!.')
recordblocking(sonido,segs); %5segundos de grabación
disp('Fin de grabación.')

% Store data in double-precision array.
sonido1 = getaudiodata(sonido);

axes(handles.axes2)
title('Sonido1')
stem(sonido1)
set(handles.axes2,'YGrid','on')
sound(sonido1,Fs);
audiowrite('sonido1.wav',sonido1,Fs); %guardar el audio myRecording en hola.wav






%NOMBRE DEL AUDIO

function edit2_Callback(hObject, eventdata, handles)
% hObject    handle to edit2 (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)

% Hints: get(hObject,'String') returns contents of edit2 as text
%        str2double(get(hObject,'String')) returns contents of edit2 as a double


% --- Executes during object creation, after setting all properties.
function edit2_CreateFcn(hObject, eventdata, handles)
% hObject    handle to edit2 (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    empty - handles not created until after all CreateFcns called

% Hint: edit controls usually have a white background on Windows.
%       See ISPC and COMPUTER.
if ispc && isequal(get(hObject,'BackgroundColor'), get(0,'defaultUicontrolBackgroundColor'))
    set(hObject,'BackgroundColor','white');
end



function edit3_Callback(hObject, eventdata, handles)
% hObject    handle to edit3 (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)

% Hints: get(hObject,'String') returns contents of edit3 as text
%        str2double(get(hObject,'String')) returns contents of edit3 as a double



% --- Executes during object creation, after setting all properties.
function edit3_CreateFcn(hObject, eventdata, handles)
% hObject    handle to edit3 (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    empty - handles not created until after all CreateFcns called

% Hint: edit controls usually have a white background on Windows.
%       See ISPC and COMPUTER.
if ispc && isequal(get(hObject,'BackgroundColor'), get(0,'defaultUicontrolBackgroundColor'))
    set(hObject,'BackgroundColor','white');
end


%BOTON VOLVER A ESCUCHAR

% --- Executes on button press in pushbutton5.
function pushbutton5_Callback(hObject, eventdata, handles)      %reproducir resultado
% hObject    handle to pushbutton5 (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)

global resultado
global Fs%frecuencia de muestreo
global segs
Fs=44100;
segs=3;%segundos a muestrear

if isnan(resultado)
    errordig('No se ha generado aún el resultado')
else
    sound(resultado,Fs);
end
% --- Executes on button press in pushbutton6.


%BOTON DESPLAZAR

% --- Executes on button press in pushbutton7.
function pushbutton7_Callback(hObject, eventdata, handles)      %desplazamiento
% hObject    handle to pushbutton7 (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)

global sonido1
global resultado
global Fs%frecuencia de muestreo
global segs

global DT

Fs=44100;
segs=3;%segundos a muestrear

DT=str2double(get(handles.edit4,'String'));
DT=DT*Fs;       %Ajustamos el valor seleccionado por el usuario a la frecuencia de muestreo

j=length(sonido1);%5*FS es la cantidad de muestras
for i=0:(j-1)
    if (i-DT<1) 
        resultado(i+1)=0;
    elseif (i-DT>j)
        resultado(i+1)=0;
    else    
        resultado(i+1)=sonido1(i-DT);
    end
end
axes(handles.axes3)
title('Resultado')
stem(resultado,'red')
set(handles.axes3,'YGrid','on')
sound(resultado,Fs);
audiowrite('resultado.wav',resultado,Fs); %guardar el audio myRecording en hola.wav



%BOTON AMPLIFICAR/ATENUAR

% --- Executes on button press in pushbutton8.
function pushbutton8_Callback(hObject, eventdata, handles)      %amplificar o atenuar
% hObject    handle to pushbutton8 (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)
global sonido1
global resultado
global Fs%frecuencia de muestreo
global segs
global AA

Fs=44100;
segs=3;%segundos a muestrear
AA=str2double(get(handles.edit5,'String'));
resultado=sonido1*AA;
axes(handles.axes3)
title('Resultado')
stem(resultado,'red')
set(handles.axes3,'YGrid','on')

sound(resultado,Fs);
audiowrite('resultado.wav',resultado,Fs); %guardar el audio myRecording en hola.wav

% --- Executes when figure1 is resized.
function figure1_ResizeFcn(hObject, eventdata, handles)
% hObject    handle to figure1 (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)


%BOTON REFLEJAR

% --- Executes on button press in pushbutton9.
function pushbutton9_Callback(hObject, eventdata, handles)          %reflejar
% hObject    handle to pushbutton9 (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)
global sonido1
global resultado
global Fs%frecuencia de muestreo
global segs

Fs=44100;
segs=1;%segundos a muestrear
resultado=sonido1;
j=length(sonido1);%5*FS es la cantidad de muestras
for i=0:(j-1)
    resultado(i+1)=sonido1(j-i);
end
axes(handles.axes3)
title('Resultado')
stem(resultado,'red')
set(handles.axes3,'YGrid','on')
sound(resultado,Fs);
audiowrite('resultado.wav',resultado,Fs); %guardar el audio myRecording en hola.wav




%BOTON DIEZMAR

% --- Executes on button press in pushbutton10.
function pushbutton10_Callback(hObject, eventdata, handles)     %escalamiento(compresion,expansion)
% hObject    handle to pushbutton10 (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)
global sonido1
global resultado
global Fs%frecuencia de muestreo
global segs
global COM


Fs=44100;
segs=3;%segundos a muestrear
COM=str2double(get(handles.edit6,'String'));


tama=length(sonido1);%5*FS es la cantidad de muestras

k=1;q=1;

    if (COM>0)
        while (k<=tama)
            aux(q)=sonido1(k);
            q=q+1;
            k=k+COM;%Recorremos las muestras originales de acuerdo al escalamiento
        end
    else    
        aux=sonido1;
    end
resultado=aux;
axes(handles.axes3)
title('Resultado')
stem(resultado,'red')
zoom
set(handles.axes3,'YGrid','on')
sound(resultado,Fs)
audiowrite('resultado.wav',resultado,Fs); %guardar el audio myRecording en hola.wav



%BOTON INTERPOLAR

% --- Executes on button press in pushbutton12.
function pushbutton12_Callback(hObject, eventdata, handles)
% hObject    handle to pushbutton12 (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)


global sonido1
global resultado
global Fs%frecuencia de muestreo
global segs
global EX

Fs=44100;
segs=3;%segundos a muestrear

EX=str2double(get(handles.edit7,'String'));

%tama=length(sonido1);%5*FS es la cantidad de muestras

    if (EX>0)
 
        [auxs,Fs]= audioread('sonido1.wav');
        
        aux = repmat(auxs',[EX 1]);
        aux = aux(:);
    else    
        aux=sonido1;
    end
resultado=aux;
axes(handles.axes3)
title('Resultado')
stem(resultado,'red')
zoom
set(handles.axes3,'YGrid','on')
sound(resultado,Fs)
audiowrite('resultado.wav',resultado,Fs); %guardar el audio myRecording en hola.wav




function edit4_Callback(hObject, eventdata, handles)
% hObject    handle to edit4 (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)

% Hints: get(hObject,'String') returns contents of edit4 as text
%        str2double(get(hObject,'String')) returns contents of edit4 as a double


% --- Executes during object creation, after setting all properties.
function edit4_CreateFcn(hObject, eventdata, handles)
% hObject    handle to edit4 (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    empty - handles not created until after all CreateFcns called

% Hint: edit controls usually have a white background on Windows.
%       See ISPC and COMPUTER.
if ispc && isequal(get(hObject,'BackgroundColor'), get(0,'defaultUicontrolBackgroundColor'))
    set(hObject,'BackgroundColor','white');
end



function edit5_Callback(hObject, eventdata, handles)
% hObject    handle to edit5 (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)

% Hints: get(hObject,'String') returns contents of edit5 as text
%        str2double(get(hObject,'String')) returns contents of edit5 as a double


% --- Executes during object creation, after setting all properties.
function edit5_CreateFcn(hObject, eventdata, handles)
% hObject    handle to edit5 (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    empty - handles not created until after all CreateFcns called

% Hint: edit controls usually have a white background on Windows.
%       See ISPC and COMPUTER.
if ispc && isequal(get(hObject,'BackgroundColor'), get(0,'defaultUicontrolBackgroundColor'))
    set(hObject,'BackgroundColor','white');
end



function edit6_Callback(hObject, eventdata, handles)
% hObject    handle to edit6 (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)

% Hints: get(hObject,'String') returns contents of edit6 as text
%        str2double(get(hObject,'String')) returns contents of edit6 as a double


% --- Executes during object creation, after setting all properties.
function edit6_CreateFcn(hObject, eventdata, handles)
% hObject    handle to edit6 (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    empty - handles not created until after all CreateFcns called

% Hint: edit controls usually have a white background on Windows.
%       See ISPC and COMPUTER.
if ispc && isequal(get(hObject,'BackgroundColor'), get(0,'defaultUicontrolBackgroundColor'))
    set(hObject,'BackgroundColor','white');
end



function edit7_Callback(hObject, eventdata, handles)
% hObject    handle to edit7 (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)

% Hints: get(hObject,'String') returns contents of edit7 as text
%        str2double(get(hObject,'String')) returns contents of edit7 as a double


% --- Executes during object creation, after setting all properties.
function edit7_CreateFcn(hObject, eventdata, handles)
% hObject    handle to edit7 (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    empty - handles not created until after all CreateFcns called

% Hint: edit controls usually have a white background on Windows.
%       See ISPC and COMPUTER.
if ispc && isequal(get(hObject,'BackgroundColor'), get(0,'defaultUicontrolBackgroundColor'))
    set(hObject,'BackgroundColor','white');
end


% --- If Enable == 'on', executes on mouse press in 5 pixel border.
% --- Otherwise, executes on mouse press in 5 pixel border or over pushbutton3.
function pushbutton3_ButtonDownFcn(hObject, eventdata, handles)
% hObject    handle to pushbutton3 (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)
