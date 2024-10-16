ALTER TABLE usuario
ALTER COLUMN fecha_nacimiento TYPE DATE USING fecha_nacimiento::DATE;