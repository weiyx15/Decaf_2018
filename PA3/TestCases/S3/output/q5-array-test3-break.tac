VTABLE(_Father) {
    <empty>
    Father
    _Father.foo;
}

VTABLE(_Child) {
    _Father
    Child
    _Father.foo;
}

VTABLE(_Main) {
    <empty>
    Main
}

FUNCTION(_Father_New) {
memo ''
_Father_New:
    _T1 = 8
    parm _T1
    _T2 =  call _Alloc
    _T3 = 0
    *(_T2 + 4) = _T3
    _T4 = VTBL <_Father>
    *(_T2 + 0) = _T4
    return _T2
}

FUNCTION(_Child_New) {
memo ''
_Child_New:
    _T5 = 12
    parm _T5
    _T6 =  call _Alloc
    _T7 = 0
    *(_T6 + 4) = _T7
    *(_T6 + 8) = _T7
    _T8 = VTBL <_Child>
    *(_T6 + 0) = _T8
    return _T6
}

FUNCTION(_Main_New) {
memo ''
_Main_New:
    _T9 = 4
    parm _T9
    _T10 =  call _Alloc
    _T11 = VTBL <_Main>
    *(_T10 + 0) = _T11
    return _T10
}

FUNCTION(_Father.foo) {
memo '_T0:4'
_Father.foo:
    _T12 = *(_T0 + 4)
    return _T12
}

FUNCTION(main) {
memo ''
main:
    _T15 = 3
    _T14 = _T15
    _T16 = 10
    _T17 = 0
    _T18 = (_T16 < _T17)
    if (_T18 == 0) branch _L13
    _T19 = "Decaf runtime error: The length of the created array should not be less than 0.\n"
    parm _T19
    call _PrintString
    call _Halt
_L13:
    _T20 = 4
    _T21 = (_T20 * _T16)
    _T22 = (_T20 + _T21)
    parm _T22
    _T23 =  call _Alloc
    *(_T23 + 0) = _T16
    _T23 = (_T23 + _T22)
_L14:
    _T22 = (_T22 - _T20)
    if (_T22 == 0) branch _L15
    _T23 = (_T23 - _T20)
    *(_T23 + 0) = _T14
    branch _L14
_L15:
    _T13 = _T23
    _T25 = 0
    _T26 = 4
    _T27 = *(_T13 - 4)
_L16:
    _T28 = (_T25 < _T27)
    if (_T28 == 0) branch _L17
    _T29 = (_T25 * _T26)
    _T30 = (_T13 + _T29)
    _T31 = *(_T30 + 0)
    _T24 = _T31
    _T32 = 1
    _T33 = (_T25 + _T32)
    _T25 = _T33
    _T34 = 2
    _T35 = (_T14 > _T34)
    if (_T35 == 0) branch _L17
    _T36 = (_T14 + _T24)
    _T14 = _T36
    parm _T24
    call _PrintInt
    parm _T14
    call _PrintInt
    _T37 = "\n"
    parm _T37
    call _PrintString
    _T38 = 20
    _T39 = (_T14 > _T38)
    if (_T39 == 0) branch _L18
    branch _L17
_L18:
    branch _L16
_L17:
}

