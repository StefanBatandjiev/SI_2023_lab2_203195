# Втора лабораториска вежба по Софтверско инженерство

# Стефан Батанџиев, бр. на индекс 203195

# Control Flow Graph
# Фотографија од control flow graph-ot

![CFG drawio](https://github.com/StefanBatandjiev/SI_2023_lab2_203195/assets/86986482/7074ba68-2c09-4a66-9a9e-9631c69b4718)

# Цикломатска комплексност
Цикломатската комплексност на овој код е 11, истата ја добив преку формулата P+1, каде што P е бројот на предикатни јазли. Во случајoв P=10, па цикломатската комплексност изнесува 11.

# Тест случаи според критериумот Every branch
За Every branch критериумот потребни се 4 тест случаеви за да се поминат сите патеки, тие се:

- со null user
- нема username, невалиден password
- username постои, e,email постои, password < 8
- password со space, различен user
![Screenshot_346](https://github.com/StefanBatandjiev/SI_2023_lab2_203195/assets/86986482/57d59529-5b64-4f72-af3f-fc0e02e5212b)


# Тест случаи според критериумот Multiple Condition
за критериумот Multiple Condition имаме 4 тест случаеви


username!=null password!=null email==null F F T
username!=null password==null email!=null F T F
username==null password!=null email!=null T F F
username==null password==null email==null T T T
