package com.adventofcode.psobiegraj.day2

data = [new Tuple2('forward', 8), new Tuple2('forward', 3), new Tuple2('down', 8), new Tuple2('forward', 4), new Tuple2('down', 2), new Tuple2('down', 4), new Tuple2('down', 8), new Tuple2('down', 4), new Tuple2('down', 7), new Tuple2('up', 4), new Tuple2('down', 6), new Tuple2('down', 2), new Tuple2('forward', 7), new Tuple2('down', 5), new Tuple2('down', 7), new Tuple2('down', 5), new Tuple2('forward', 8), new Tuple2('forward', 4), new Tuple2('forward', 3), new Tuple2('down', 4), new Tuple2('forward', 2), new Tuple2('up', 3), new Tuple2('up', 6), new Tuple2('forward', 7), new Tuple2('down', 4), new Tuple2('down', 2), new Tuple2('forward', 7), new Tuple2('up', 3), new Tuple2('forward', 8), new Tuple2('down', 4), new Tuple2('down', 6), new Tuple2('forward', 3), new Tuple2('forward', 9), new Tuple2('down', 9), new Tuple2('down', 6), new Tuple2('forward', 8), new Tuple2('up', 8), new Tuple2('forward', 3), new Tuple2('down', 8), new Tuple2('down', 4), new Tuple2('forward', 7), new Tuple2('forward', 3), new Tuple2('up', 9), new Tuple2('down', 8), new Tuple2('forward', 7), new Tuple2('forward', 5), new Tuple2('forward', 3), new Tuple2('down', 1), new Tuple2('down', 4), new Tuple2('forward', 1), new Tuple2('down', 6), new Tuple2('forward', 9), new Tuple2('up', 2), new Tuple2('forward', 3), new Tuple2('down', 2), new Tuple2('down', 1), new Tuple2('up', 5), new Tuple2('down', 8), new Tuple2('down', 7), new Tuple2('down', 5), new Tuple2('down', 9), new Tuple2('up', 7), new Tuple2('forward', 4), new Tuple2('down', 9), new Tuple2('down', 8), new Tuple2('down', 4), new Tuple2('forward', 3), new Tuple2('down', 1), new Tuple2('up', 8), new Tuple2('down', 1), new Tuple2('down', 8), new Tuple2('forward', 4), new Tuple2('up', 1), new Tuple2('forward', 7), new Tuple2('down', 6), new Tuple2('down', 2), new Tuple2('forward', 3), new Tuple2('down', 9), new Tuple2('forward', 9), new Tuple2('forward', 4), new Tuple2('down', 1), new Tuple2('up', 6), new Tuple2('down', 1), new Tuple2('up', 2), new Tuple2('down', 4), new Tuple2('down', 9), new Tuple2('down', 7), new Tuple2('forward', 5), new Tuple2('down', 3), new Tuple2('up', 9), new Tuple2('forward', 4), new Tuple2('up', 5), new Tuple2('down', 9), new Tuple2('forward', 1), new Tuple2('forward', 7), new Tuple2('forward', 1), new Tuple2('down', 8), new Tuple2('forward', 5), new Tuple2('down', 2), new Tuple2('down', 4), new Tuple2('down', 3), new Tuple2('forward', 4), new Tuple2('down', 9), new Tuple2('up', 7), new Tuple2('up', 1), new Tuple2('forward', 4), new Tuple2('up', 2), new Tuple2('forward', 4), new Tuple2('forward', 4), new Tuple2('down', 1), new Tuple2('down', 5), new Tuple2('forward', 6), new Tuple2('forward', 1), new Tuple2('down', 6), new Tuple2('forward', 8), new Tuple2('forward', 8), new Tuple2('forward', 6), new Tuple2('down', 3), new Tuple2('forward', 3), new Tuple2('forward', 1), new Tuple2('forward', 5), new Tuple2('forward', 7), new Tuple2('down', 5), new Tuple2('forward', 8), new Tuple2('down', 7), new Tuple2('down', 8), new Tuple2('forward', 7), new Tuple2('forward', 8), new Tuple2('down', 7), new Tuple2('forward', 7), new Tuple2('up', 2), new Tuple2('up', 9), new Tuple2('down', 1), new Tuple2('forward', 1), new Tuple2('forward', 6), new Tuple2('up', 3), new Tuple2('up', 6), new Tuple2('down', 2), new Tuple2('down', 4), new Tuple2('forward', 2), new Tuple2('up', 8), new Tuple2('forward', 5), new Tuple2('up', 9), new Tuple2('up', 5), new Tuple2('down', 2), new Tuple2('forward', 5), new Tuple2('forward', 9), new Tuple2('up', 3), new Tuple2('forward', 7), new Tuple2('down', 4), new Tuple2('down', 3), new Tuple2('down', 2), new Tuple2('forward', 9), new Tuple2('up', 4), new Tuple2('down', 7), new Tuple2('down', 1), new Tuple2('forward', 9), new Tuple2('forward', 3), new Tuple2('up', 4), new Tuple2('forward', 1), new Tuple2('up', 6), new Tuple2('forward', 5), new Tuple2('forward', 2), new Tuple2('forward', 2), new Tuple2('down', 9), new Tuple2('forward', 1), new Tuple2('up', 7), new Tuple2('forward', 3), new Tuple2('down', 1), new Tuple2('down', 5), new Tuple2('up', 8), new Tuple2('down', 5), new Tuple2('forward', 5), new Tuple2('forward', 5), new Tuple2('down', 9), new Tuple2('up', 5), new Tuple2('forward', 8), new Tuple2('up', 9), new Tuple2('down', 1), new Tuple2('forward', 1), new Tuple2('down', 7), new Tuple2('up', 3), new Tuple2('down', 9), new Tuple2('down', 9), new Tuple2('down', 5), new Tuple2('up', 6), new Tuple2('forward', 7), new Tuple2('down', 5), new Tuple2('down', 2), new Tuple2('down', 5), new Tuple2('forward', 3), new Tuple2('forward', 2), new Tuple2('forward', 9), new Tuple2('forward', 5), new Tuple2('forward', 6), new Tuple2('up', 7), new Tuple2('up', 7), new Tuple2('forward', 4), new Tuple2('forward', 2), new Tuple2('up', 4), new Tuple2('up', 6), new Tuple2('down', 8), new Tuple2('up', 9), new Tuple2('up', 5), new Tuple2('down', 8), new Tuple2('forward', 4), new Tuple2('up', 9), new Tuple2('forward', 8), new Tuple2('forward', 3), new Tuple2('down', 6), new Tuple2('down', 6), new Tuple2('down', 7), new Tuple2('down', 6), new Tuple2('forward', 7), new Tuple2('up', 5), new Tuple2('down', 2), new Tuple2('down', 5), new Tuple2('forward', 2), new Tuple2('up', 5), new Tuple2('forward', 7), new Tuple2('down', 5), new Tuple2('up', 4), new Tuple2('up', 2), new Tuple2('forward', 2), new Tuple2('forward', 9), new Tuple2('forward', 5), new Tuple2('forward', 8), new Tuple2('up', 4), new Tuple2('forward', 6), new Tuple2('up', 7), new Tuple2('forward', 5), new Tuple2('down', 2), new Tuple2('down', 3), new Tuple2('down', 8), new Tuple2('up', 2), new Tuple2('down', 2), new Tuple2('up', 1), new Tuple2('up', 7), new Tuple2('down', 1), new Tuple2('down', 6), new Tuple2('down', 9), new Tuple2('down', 7), new Tuple2('forward', 8), new Tuple2('up', 8), new Tuple2('up', 9), new Tuple2('down', 9), new Tuple2('forward', 6), new Tuple2('forward', 6), new Tuple2('down', 6), new Tuple2('forward', 3), new Tuple2('forward', 4), new Tuple2('forward', 6), new Tuple2('forward', 7), new Tuple2('down', 5), new Tuple2('down', 8), new Tuple2('forward', 7), new Tuple2('forward', 9), new Tuple2('down', 4), new Tuple2('up', 9), new Tuple2('forward', 8), new Tuple2('down', 6), new Tuple2('down', 1), new Tuple2('down', 2), new Tuple2('forward', 4), new Tuple2('down', 5), new Tuple2('up', 1), new Tuple2('forward', 1), new Tuple2('down', 6), new Tuple2('forward', 4), new Tuple2('forward', 2), new Tuple2('forward', 6), new Tuple2('down', 8), new Tuple2('up', 2), new Tuple2('up', 8), new Tuple2('forward', 3), new Tuple2('down', 6), new Tuple2('forward', 7), new Tuple2('down', 1), new Tuple2('forward', 1), new Tuple2('forward', 8), new Tuple2('down', 8), new Tuple2('down', 8), new Tuple2('down', 2), new Tuple2('forward', 8), new Tuple2('down', 4), new Tuple2('up', 8), new Tuple2('down', 6), new Tuple2('forward', 2), new Tuple2('down', 5), new Tuple2('up', 3), new Tuple2('up', 1), new Tuple2('down', 2), new Tuple2('forward', 4), new Tuple2('up', 7), new Tuple2('forward', 2), new Tuple2('up', 9), new Tuple2('forward', 1), new Tuple2('down', 5), new Tuple2('forward', 3), new Tuple2('up', 9), new Tuple2('up', 4), new Tuple2('down', 4), new Tuple2('up', 6), new Tuple2('down', 1), new Tuple2('forward', 9), new Tuple2('up', 5), new Tuple2('forward', 5), new Tuple2('up', 4), new Tuple2('down', 6), new Tuple2('forward', 2), new Tuple2('up', 6), new Tuple2('forward', 5), new Tuple2('forward', 5), new Tuple2('down', 4), new Tuple2('up', 7), new Tuple2('forward', 2), new Tuple2('down', 9), new Tuple2('down', 8), new Tuple2('down', 7), new Tuple2('forward', 4), new Tuple2('forward', 7), new Tuple2('down', 4), new Tuple2('forward', 9), new Tuple2('up', 2), new Tuple2('forward', 1), new Tuple2('up', 4), new Tuple2('down', 8), new Tuple2('forward', 9), new Tuple2('up', 2), new Tuple2('up', 5), new Tuple2('down', 7), new Tuple2('up', 6), new Tuple2('forward', 7), new Tuple2('up', 1), new Tuple2('forward', 3), new Tuple2('down', 3), new Tuple2('down', 2), new Tuple2('down', 6), new Tuple2('down', 6), new Tuple2('forward', 3), new Tuple2('down', 2), new Tuple2('down', 2), new Tuple2('down', 5), new Tuple2('down', 4), new Tuple2('down', 6), new Tuple2('down', 2), new Tuple2('forward', 7), new Tuple2('down', 6), new Tuple2('forward', 4), new Tuple2('down', 5), new Tuple2('down', 7), new Tuple2('down', 3), new Tuple2('forward', 2), new Tuple2('forward', 8), new Tuple2('forward', 1), new Tuple2('up', 6), new Tuple2('down', 8), new Tuple2('down', 4), new Tuple2('up', 5), new Tuple2('forward', 5), new Tuple2('down', 7), new Tuple2('forward', 5), new Tuple2('forward', 8), new Tuple2('forward', 7), new Tuple2('down', 8), new Tuple2('down', 5), new Tuple2('down', 3), new Tuple2('up', 2), new Tuple2('forward', 8), new Tuple2('forward', 7), new Tuple2('down', 6), new Tuple2('up', 1), new Tuple2('down', 9), new Tuple2('down', 3), new Tuple2('down', 7), new Tuple2('down', 2), new Tuple2('forward', 9), new Tuple2('forward', 2), new Tuple2('forward', 4), new Tuple2('forward', 8), new Tuple2('forward', 3), new Tuple2('forward', 2), new Tuple2('down', 3), new Tuple2('down', 8), new Tuple2('up', 7), new Tuple2('down', 7), new Tuple2('down', 1), new Tuple2('forward', 8), new Tuple2('down', 2), new Tuple2('up', 4), new Tuple2('forward', 9), new Tuple2('down', 6), new Tuple2('forward', 5), new Tuple2('forward', 8), new Tuple2('forward', 1), new Tuple2('forward', 4), new Tuple2('down', 6), new Tuple2('down', 1), new Tuple2('down', 6), new Tuple2('forward', 1), new Tuple2('forward', 7), new Tuple2('down', 3), new Tuple2('down', 3), new Tuple2('down', 1), new Tuple2('up', 2), new Tuple2('down', 6), new Tuple2('down', 5), new Tuple2('down', 6), new Tuple2('forward', 5), new Tuple2('forward', 2), new Tuple2('forward', 1), new Tuple2('forward', 8), new Tuple2('up', 5), new Tuple2('down', 2), new Tuple2('down', 9), new Tuple2('down', 9), new Tuple2('down', 5), new Tuple2('down', 3), new Tuple2('up', 6), new Tuple2('forward', 2), new Tuple2('down', 7), new Tuple2('down', 7), new Tuple2('down', 2), new Tuple2('down', 2), new Tuple2('up', 6), new Tuple2('forward', 8), new Tuple2('forward', 6), new Tuple2('forward', 4), new Tuple2('down', 1), new Tuple2('forward', 7), new Tuple2('down', 5), new Tuple2('up', 9), new Tuple2('forward', 5), new Tuple2('down', 4), new Tuple2('down', 9), new Tuple2('up', 7), new Tuple2('forward', 1), new Tuple2('up', 3), new Tuple2('up', 7), new Tuple2('forward', 6), new Tuple2('forward', 8), new Tuple2('up', 6), new Tuple2('up', 3), new Tuple2('forward', 4), new Tuple2('up', 3), new Tuple2('down', 1), new Tuple2('forward', 8), new Tuple2('forward', 1), new Tuple2('up', 3), new Tuple2('forward', 7), new Tuple2('up', 2), new Tuple2('forward', 6), new Tuple2('forward', 2), new Tuple2('down', 2), new Tuple2('down', 9), new Tuple2('down', 9), new Tuple2('forward', 1), new Tuple2('forward', 8), new Tuple2('down', 5), new Tuple2('forward', 4), new Tuple2('forward', 5), new Tuple2('forward', 5), new Tuple2('down', 9), new Tuple2('forward', 8), new Tuple2('up', 8), new Tuple2('down', 6), new Tuple2('down', 2), new Tuple2('down', 5), new Tuple2('down', 6), new Tuple2('up', 9), new Tuple2('up', 8), new Tuple2('down', 4), new Tuple2('down', 9), new Tuple2('up', 4), new Tuple2('forward', 6), new Tuple2('forward', 1), new Tuple2('forward', 3), new Tuple2('up', 4), new Tuple2('up', 3), new Tuple2('forward', 3), new Tuple2('forward', 8), new Tuple2('down', 1), new Tuple2('down', 2), new Tuple2('down', 2), new Tuple2('forward', 9), new Tuple2('forward', 4), new Tuple2('up', 2), new Tuple2('forward', 7), new Tuple2('down', 4), new Tuple2('up', 1), new Tuple2('forward', 2), new Tuple2('forward', 9), new Tuple2('forward', 8), new Tuple2('down', 4), new Tuple2('down', 7), new Tuple2('up', 7), new Tuple2('down', 1), new Tuple2('forward', 3), new Tuple2('down', 7), new Tuple2('down', 8), new Tuple2('up', 2), new Tuple2('forward', 2), new Tuple2('forward', 8), new Tuple2('forward', 4), new Tuple2('forward', 4), new Tuple2('down', 5), new Tuple2('forward', 8), new Tuple2('down', 2), new Tuple2('up', 7), new Tuple2('down', 1), new Tuple2('up', 9), new Tuple2('up', 5), new Tuple2('down', 3), new Tuple2('forward', 6), new Tuple2('forward', 2), new Tuple2('forward', 6), new Tuple2('down', 5), new Tuple2('down', 6), new Tuple2('forward', 9), new Tuple2('up', 5), new Tuple2('up', 6), new Tuple2('down', 4), new Tuple2('down', 5), new Tuple2('up', 4), new Tuple2('down', 6), new Tuple2('down', 2), new Tuple2('down', 5), new Tuple2('down', 4), new Tuple2('forward', 7), new Tuple2('forward', 6), new Tuple2('down', 8), new Tuple2('forward', 2), new Tuple2('down', 5), new Tuple2('down', 7), new Tuple2('down', 2), new Tuple2('forward', 8), new Tuple2('forward', 6), new Tuple2('down', 3), new Tuple2('forward', 4), new Tuple2('up', 6), new Tuple2('down', 9), new Tuple2('down', 3), new Tuple2('forward', 3), new Tuple2('forward', 3), new Tuple2('down', 9), new Tuple2('up', 1), new Tuple2('up', 3), new Tuple2('forward', 3), new Tuple2('forward', 6), new Tuple2('forward', 1), new Tuple2('forward', 4), new Tuple2('forward', 3), new Tuple2('forward', 3), new Tuple2('forward', 3), new Tuple2('down', 6), new Tuple2('down', 8), new Tuple2('forward', 3), new Tuple2('down', 5), new Tuple2('forward', 8), new Tuple2('forward', 3), new Tuple2('down', 4), new Tuple2('up', 3), new Tuple2('up', 1), new Tuple2('down', 7), new Tuple2('forward', 7), new Tuple2('up', 6), new Tuple2('forward', 7), new Tuple2('down', 4), new Tuple2('down', 7), new Tuple2('up', 9), new Tuple2('down', 9), new Tuple2('forward', 8), new Tuple2('down', 5), new Tuple2('down', 2), new Tuple2('forward', 9), new Tuple2('down', 3), new Tuple2('forward', 4), new Tuple2('forward', 4), new Tuple2('forward', 4), new Tuple2('forward', 6), new Tuple2('down', 1), new Tuple2('up', 5), new Tuple2('forward', 8), new Tuple2('down', 6), new Tuple2('forward', 5), new Tuple2('up', 5), new Tuple2('up', 5), new Tuple2('down', 2), new Tuple2('down', 9), new Tuple2('down', 7), new Tuple2('up', 3), new Tuple2('up', 7), new Tuple2('up', 6), new Tuple2('forward', 2), new Tuple2('forward', 6), new Tuple2('up', 9), new Tuple2('forward', 5), new Tuple2('forward', 2), new Tuple2('up', 4), new Tuple2('down', 4), new Tuple2('down', 5), new Tuple2('forward', 7), new Tuple2('down', 5), new Tuple2('down', 7), new Tuple2('forward', 3), new Tuple2('down', 6), new Tuple2('down', 1), new Tuple2('forward', 6), new Tuple2('up', 5), new Tuple2('up', 6), new Tuple2('up', 3), new Tuple2('down', 9), new Tuple2('up', 7), new Tuple2('forward', 9), new Tuple2('down', 3), new Tuple2('forward', 4), new Tuple2('up', 2), new Tuple2('forward', 9), new Tuple2('down', 2), new Tuple2('up', 2), new Tuple2('up', 5), new Tuple2('forward', 1), new Tuple2('down', 8), new Tuple2('down', 1), new Tuple2('down', 8), new Tuple2('up', 2), new Tuple2('forward', 9), new Tuple2('forward', 1), new Tuple2('up', 2), new Tuple2('down', 1), new Tuple2('up', 1), new Tuple2('forward', 2), new Tuple2('down', 7), new Tuple2('forward', 9), new Tuple2('up', 1), new Tuple2('forward', 8), new Tuple2('down', 5), new Tuple2('down', 5), new Tuple2('down', 9), new Tuple2('forward', 5), new Tuple2('down', 7), new Tuple2('down', 1), new Tuple2('forward', 9), new Tuple2('down', 5), new Tuple2('forward', 9), new Tuple2('forward', 9), new Tuple2('down', 6), new Tuple2('down', 5), new Tuple2('down', 6), new Tuple2('forward', 3), new Tuple2('down', 4), new Tuple2('up', 8), new Tuple2('down', 6), new Tuple2('up', 4), new Tuple2('down', 9), new Tuple2('up', 1), new Tuple2('up', 2), new Tuple2('up', 8), new Tuple2('forward', 6), new Tuple2('down', 7), new Tuple2('down', 4), new Tuple2('down', 9), new Tuple2('down', 3), new Tuple2('forward', 9), new Tuple2('down', 5), new Tuple2('forward', 6), new Tuple2('down', 6), new Tuple2('forward', 7), new Tuple2('down', 9), new Tuple2('forward', 2), new Tuple2('forward', 2), new Tuple2('down', 8), new Tuple2('down', 7), new Tuple2('forward', 5), new Tuple2('down', 8), new Tuple2('forward', 6), new Tuple2('down', 1), new Tuple2('forward', 6), new Tuple2('forward', 7), new Tuple2('forward', 3), new Tuple2('forward', 2), new Tuple2('forward', 1), new Tuple2('forward', 1), new Tuple2('down', 9), new Tuple2('forward', 7), new Tuple2('up', 9), new Tuple2('down', 5), new Tuple2('forward', 6), new Tuple2('down', 4), new Tuple2('down', 2), new Tuple2('forward', 4), new Tuple2('forward', 3), new Tuple2('forward', 9), new Tuple2('down', 8), new Tuple2('down', 2), new Tuple2('forward', 4), new Tuple2('down', 8), new Tuple2('down', 6), new Tuple2('forward', 9), new Tuple2('down', 7), new Tuple2('forward', 1), new Tuple2('up', 1), new Tuple2('forward', 3), new Tuple2('down', 5), new Tuple2('down', 8), new Tuple2('up', 6), new Tuple2('forward', 9), new Tuple2('forward', 4), new Tuple2('down', 2), new Tuple2('forward', 4), new Tuple2('up', 2), new Tuple2('forward', 9), new Tuple2('down', 5), new Tuple2('down', 1), new Tuple2('down', 9), new Tuple2('forward', 5), new Tuple2('down', 9), new Tuple2('forward', 1), new Tuple2('down', 9), new Tuple2('forward', 8), new Tuple2('down', 5), new Tuple2('forward', 9), new Tuple2('forward', 8), new Tuple2('up', 8), new Tuple2('down', 7), new Tuple2('up', 9), new Tuple2('down', 5), new Tuple2('up', 9), new Tuple2('forward', 7), new Tuple2('forward', 7), new Tuple2('forward', 1), new Tuple2('up', 2), new Tuple2('up', 2), new Tuple2('forward', 6), new Tuple2('up', 5), new Tuple2('up', 5), new Tuple2('down', 7), new Tuple2('forward', 2), new Tuple2('up', 8), new Tuple2('forward', 8), new Tuple2('down', 8), new Tuple2('forward', 7), new Tuple2('forward', 8), new Tuple2('down', 7), new Tuple2('down', 8), new Tuple2('forward', 4), new Tuple2('forward', 2), new Tuple2('down', 8), new Tuple2('up', 4), new Tuple2('down', 1), new Tuple2('up', 7), new Tuple2('forward', 4), new Tuple2('forward', 3), new Tuple2('down', 6), new Tuple2('up', 6), new Tuple2('forward', 6), new Tuple2('down', 1), new Tuple2('forward', 3), new Tuple2('down', 6), new Tuple2('forward', 6), new Tuple2('up', 3), new Tuple2('up', 1), new Tuple2('up', 5), new Tuple2('down', 1), new Tuple2('up', 9), new Tuple2('down', 8), new Tuple2('forward', 7), new Tuple2('forward', 9), new Tuple2('up', 2), new Tuple2('forward', 2), new Tuple2('forward', 6), new Tuple2('up', 2), new Tuple2('up', 3), new Tuple2('forward', 1), new Tuple2('forward', 2), new Tuple2('forward', 8), new Tuple2('down', 6), new Tuple2('forward', 5), new Tuple2('down', 8), new Tuple2('forward', 2), new Tuple2('up', 1), new Tuple2('down', 1), new Tuple2('down', 3), new Tuple2('forward', 9), new Tuple2('down', 6), new Tuple2('down', 1), new Tuple2('down', 6), new Tuple2('down', 6), new Tuple2('down', 6), new Tuple2('down', 1), new Tuple2('up', 6), new Tuple2('down', 6), new Tuple2('forward', 6), new Tuple2('down', 5), new Tuple2('down', 2), new Tuple2('up', 5), new Tuple2('forward', 7), new Tuple2('down', 3), new Tuple2('forward', 9), new Tuple2('forward', 2), new Tuple2('down', 2), new Tuple2('down', 1), new Tuple2('down', 9), new Tuple2('up', 3), new Tuple2('down', 2), new Tuple2('forward', 2), new Tuple2('forward', 6), new Tuple2('down', 4), new Tuple2('up', 7), new Tuple2('up', 3), new Tuple2('up', 9), new Tuple2('forward', 3), new Tuple2('forward', 8), new Tuple2('forward', 9), new Tuple2('forward', 4), new Tuple2('forward', 2), new Tuple2('up', 7), new Tuple2('up', 5), new Tuple2('down', 9), new Tuple2('forward', 1), new Tuple2('up', 1), new Tuple2('down', 7), new Tuple2('forward', 5), new Tuple2('forward', 5), new Tuple2('down', 3), new Tuple2('forward', 1), new Tuple2('forward', 6), new Tuple2('up', 8), new Tuple2('down', 4), new Tuple2('down', 2), new Tuple2('up', 2), new Tuple2('forward', 2), new Tuple2('forward', 1), new Tuple2('down', 4), new Tuple2('up', 9), new Tuple2('down', 1), new Tuple2('down', 4), new Tuple2('down', 6), new Tuple2('forward', 3), new Tuple2('forward', 7), new Tuple2('down', 4), new Tuple2('up', 8), new Tuple2('down', 6), new Tuple2('forward', 7), new Tuple2('forward', 4), new Tuple2('up', 2), new Tuple2('down', 8), new Tuple2('forward', 5), new Tuple2('down', 1), new Tuple2('forward', 7), new Tuple2('down', 1), new Tuple2('up', 6), new Tuple2('down', 9), new Tuple2('forward', 3), new Tuple2('forward', 1), new Tuple2('up', 2), new Tuple2('up', 4), new Tuple2('forward', 8), new Tuple2('forward', 1), new Tuple2('up', 8), new Tuple2('forward', 3), new Tuple2('forward', 7), new Tuple2('up', 9), new Tuple2('up', 6), new Tuple2('up', 9), new Tuple2('down', 9), new Tuple2('down', 5), new Tuple2('forward', 8), new Tuple2('forward', 7), new Tuple2('down', 5), new Tuple2('forward', 7), new Tuple2('forward', 6), new Tuple2('forward', 8), new Tuple2('up', 4), new Tuple2('forward', 6), new Tuple2('down', 6), new Tuple2('up', 8), new Tuple2('down', 7), new Tuple2('up', 8), new Tuple2('forward', 6), new Tuple2('forward', 7), new Tuple2('down', 4), new Tuple2('forward', 4), new Tuple2('up', 2), new Tuple2('forward', 9), new Tuple2('down', 6), new Tuple2('down', 2), new Tuple2('down', 8), new Tuple2('forward', 6), new Tuple2('up', 2), new Tuple2('up', 8), new Tuple2('forward', 2), new Tuple2('down', 3), new Tuple2('forward', 7), new Tuple2('forward', 6), new Tuple2('down', 9), new Tuple2('up', 1), new Tuple2('forward', 1), new Tuple2('down', 8), new Tuple2('down', 8), new Tuple2('forward', 4), new Tuple2('forward', 4), new Tuple2('up', 6), new Tuple2('down', 8), new Tuple2('up', 8), new Tuple2('forward', 1), new Tuple2('forward', 1), new Tuple2('down', 6), new Tuple2('up', 3), new Tuple2('up', 7), new Tuple2('forward', 1), new Tuple2('forward', 1), new Tuple2('up', 2), new Tuple2('forward', 2), new Tuple2('down', 4), new Tuple2('up', 8), new Tuple2('forward', 1), new Tuple2('up', 7), new Tuple2('down', 2), new Tuple2('forward', 2), new Tuple2('down', 1), new Tuple2('forward', 1), new Tuple2('down', 4), new Tuple2('forward', 4), new Tuple2('forward', 8), new Tuple2('up', 5), new Tuple2('down', 6), new Tuple2('up', 8), new Tuple2('forward', 4), new Tuple2('down', 3), new Tuple2('up', 6), new Tuple2('forward', 3), new Tuple2('forward', 4), new Tuple2('down', 5), new Tuple2('forward', 1), new Tuple2('forward', 6), new Tuple2('forward', 4), new Tuple2('forward', 1), new Tuple2('down', 7), new Tuple2('down', 4), new Tuple2('forward', 2), new Tuple2('down', 6), new Tuple2('forward', 3), new Tuple2('down', 5), new Tuple2('forward', 3), new Tuple2('forward', 4), new Tuple2('forward', 4), new Tuple2('forward', 9), new Tuple2('down', 5), new Tuple2('forward', 7), new Tuple2('forward', 7), new Tuple2('forward', 9), new Tuple2('down', 1), new Tuple2('up', 6), new Tuple2('forward', 1), new Tuple2('down', 9), new Tuple2('forward', 3), new Tuple2('down', 7), new Tuple2('up', 8), new Tuple2('up', 6), new Tuple2('down', 7), new Tuple2('forward', 2), new Tuple2('down', 9), new Tuple2('forward', 9), new Tuple2('forward', 6), new Tuple2('down', 9), new Tuple2('forward', 6), new Tuple2('down', 8), new Tuple2('forward', 1), new Tuple2('up', 6), new Tuple2('down', 1), new Tuple2('forward', 6), new Tuple2('down', 9), new Tuple2('forward', 6), new Tuple2('forward', 7), new Tuple2('forward', 3), new Tuple2('forward', 8), new Tuple2('forward', 5), new Tuple2('forward', 8), new Tuple2('down', 9), new Tuple2('down', 2), new Tuple2('forward', 3), new Tuple2('down', 3), new Tuple2('up', 4), new Tuple2('down', 4), new Tuple2('down', 3), new Tuple2('forward', 3), new Tuple2('forward', 3), new Tuple2('down', 5), new Tuple2('forward', 5), new Tuple2('forward', 1), new Tuple2('down', 9), new Tuple2('down', 3), new Tuple2('up', 7), new Tuple2('forward', 9), new Tuple2('up', 1), new Tuple2('down', 1), new Tuple2('down', 6), new Tuple2('up', 1), new Tuple2('forward', 2)]


long horizontal = 0
long depth = 0

for(tuple in data){
    switch(tuple[0]){
        case 'forward':
            horizontal += tuple[1]
            break
        case 'down':
            depth += tuple[1]
            break
        case 'up':
            depth -= tuple[1]
            break
    }
}

println 'horizontal: ' + horizontal
println 'dept: ' + depth

println 'Result of task 1: ' + horizontal * depth

long aim = 0
horizontal = 0
depth = 0

for(tuple in data) {
    switch (tuple[0]) {
        case 'forward':
            horizontal += tuple[1]
            depth += aim * (int) tuple[1]
            break
        case 'down':
            aim += tuple[1]
            break
        case 'up':
            aim -= tuple[1]
            break
    }
}

println 'Result of task 2: ' + horizontal * depth