VTABLE(_Father) {
    <empty>
    Father
    _Father.print;
}

VTABLE(_Son) {
    _Father
    Son
    _Son.print;
}

VTABLE(_Main) {
    <empty>
    Main
}

FUNCTION(_Father_New) {
memo ''
_Father_New:
    _T2 = 8
    parm _T2
    _T3 =  call _Alloc
    _T4 = 0
    *(_T3 + 4) = _T4
    _T5 = VTBL <_Father>
    *(_T3 + 0) = _T5
    return _T3
}

FUNCTION(_Son_New) {
memo ''
_Son_New:
    _T6 = 12
    parm _T6
    _T7 =  call _Alloc
    _T8 = 0
    *(_T7 + 4) = _T8
    *(_T7 + 8) = _T8
    _T9 = VTBL <_Son>
    *(_T7 + 0) = _T9
    return _T7
}

FUNCTION(_Main_New) {
memo ''
_Main_New:
    _T10 = 4
    parm _T10
    _T11 =  call _Alloc
    _T12 = VTBL <_Main>
    *(_T11 + 0) = _T12
    return _T11
}

FUNCTION(_Father.print) {
memo '_T0:4'
_Father.print:
    _T13 = "Father\n"
    parm _T13
    call _PrintString
}

FUNCTION(_Son.print) {
memo '_T1:4'
_Son.print:
    _T14 = "Son\n"
    parm _T14
    call _PrintString
}

FUNCTION(main) {
memo ''
main:
    _T16 =  call _Son_New
    _T15 = _T16
    parm _T15
    _T17 = *(_T15 + 0)
    _T18 = *(_T17 + 8)
    call _T18
}

