
%Cebada Velzaquez Luis
%Rodriguez diego

%PROYECTO - OPERACIONES DE SEÑALES DISCRETAS

function importfile(fileToRead1)

% Import the file
newData1 = importdata(fileToRead1);

% Create new variables in the base workspace from those fields.
vars = fieldnames(newData1);
for i = 1:length(vars)
    assignin('base', vars{i}, newData1.(vars{i}));
end

plot(vars);

