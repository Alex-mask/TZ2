# TZ2
### BIO
Масычев Александр Ильич ББИ235

Реализованы четыре функции для поиска минимума, максимума, суммы и произведения числе в файле, также реализовано чтение из файла (`NumberOperations.java`). Функции прописаны ручным алгоритмом, а ассерты сверяют результат со встроенными функциями, выполняющими аналогичное действие. Все тесты можно увидеть в файле `NumberOperationsTest.java`

### Текущее состояние тестов
![](https://github.com/Alex-mask/TZ2/actions/workflows/main.yml/badge.svg) <br>
### График зависимости времени от размера входного файла 
![](https://github.com/Alex-mask/TZ2/blob/main/time-size_plot.png)
Я замерял время выполнения на функции sum, в репозитории представлены 4 файла с разным количеством чисел, однако дополнительно я генерил файлы промежуточной длины, чтобы сделать более плавную линию, сюда в репозиторий закинул лишь некоторые из них.
Файл с кодом для замера времени - `NumberOperationsSpeedTest.java`. Сам график построил вручную после сбора данных. 
Здесь довольно логично, что в зависимости от размера файла увеличивается время его исполнения, при этом оно растет медленнее чем размер файла, что удивительно, так как временная сложность `O(n)`.
