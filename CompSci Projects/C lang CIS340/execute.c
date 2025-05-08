//
// Created by Rebeca on 10/8/2024.
//

#include "execute.h"


long execute(long w, long z, long (*arithmetic)(long, long)) {
    return arithmetic(w, z);
}
