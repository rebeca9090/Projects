cmake_minimum_required(VERSION 3.29)
project(untitled C)

set(CMAKE_C_STANDARD 11)

add_executable(untitled main.c
        inventory.h
        source.c
        execute.c
        execute.h
        add.c
        add.h
        subtract.c
        subtract.h
        multiply.c
        multiply.h
        divide.c
        divide.h
)
