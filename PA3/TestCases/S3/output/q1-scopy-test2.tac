VTABLE(_A) {
    <empty>
    A
    _A.seta;
    _A.getA;
}

VTABLE(_Father) {
    <empty>
    Father
    _Father.setfield;
    _Father.setOnlyfiled;
    _Father.getfield;
    _Father.seta;
    _Father.getA;
}

VTABLE(_Main) {
    <empty>
    Main
}

FUNCTION(_A_New) {
memo ''
_A_New:
    _T11 = 8
    parm _T11
    _T12 =  call _Alloc
    _T13 = 0
    *(_T12 + 4) = _T13
    _T14 = VTBL <_A>
    *(_T12 + 0) = _T14
    return _T12
}

FUNCTION(_Father_New) {
memo ''
_Father_New:
    _T15 = 12
    parm _T15
    _T16 =  call _Alloc
    _T17 = 0
    *(_T16 + 4) = _T17
    *(_T16 + 8) = _T17
    _T18 = VTBL <_Father>
    *(_T16 + 0) = _T18
    return _T16
}

FUNCTION(_Main_New) {
memo ''
_Main_New:
    _T19 = 4
    parm _T19
    _T20 =  call _Alloc
    _T21 = VTBL <_Main>
    *(_T20 + 0) = _T21
    return _T20
}

FUNCTION(_A.seta) {
memo '_T0:4 _T1:8'
_A.seta:
    _T22 = *(_T0 + 4)
    *(_T0 + 4) = _T1
}

FUNCTION(_A.getA) {
memo '_T2:4'
_A.getA:
    _T23 = *(_T2 + 4)
    return _T23
}

FUNCTION(_Father.setfield) {
memo '_T3:4 _T4:8'
_Father.setfield:
    _T24 = *(_T3 + 4)
    *(_T3 + 4) = _T4
    _T25 = *(_T3 + 8)
    _T26 =  call _A_New
    *(_T3 + 8) = _T26
}

FUNCTION(_Father.setOnlyfiled) {
memo '_T5:4 _T6:8'
_Father.setOnlyfiled:
    _T27 = *(_T5 + 4)
    *(_T5 + 4) = _T6
}

FUNCTION(_Father.getfield) {
memo '_T7:4'
_Father.getfield:
    _T28 = *(_T7 + 4)
    return _T28
}

FUNCTION(_Father.seta) {
memo '_T8:4 _T9:8'
_Father.seta:
    _T29 = *(_T8 + 8)
    parm _T29
    parm _T9
    _T30 = *(_T29 + 0)
    _T31 = *(_T30 + 8)
    call _T31
}

FUNCTION(_Father.getA) {
memo '_T10:4'
_Father.getA:
    _T32 = *(_T10 + 8)
    parm _T32
    _T33 = *(_T32 + 0)
    _T34 = *(_T33 + 12)
    _T35 =  call _T34
}

FUNCTION(main) {
memo ''
main:
    _T38 =  call _Father_New
    _T37 = _T38
    _T39 = 1
    parm _T37
    parm _T39
    _T40 = *(_T37 + 0)
    _T41 = *(_T40 + 8)
    call _T41
    _T42 = 2
    parm _T37
    parm _T42
    _T43 = *(_T37 + 0)
    _T44 = *(_T43 + 20)
    call _T44
    _T45 =  call _Father_New
    _T46 = 12
    _T47 = 4
    _T48 = 4
_L19:
    _T49 = (_T48 < _T46)
    if (_T49 == 0) branch _L20
    _T50 = (_T37 + _T48)
    _T51 = *(_T50 + 0)
    _T52 = (_T45 + _T48)
    *(_T52 + 0) = _T51
    _T53 = (_T48 + _T47)
    _T48 = _T53
    branch _L19
_L20:
    _T36 = _T45
    parm _T37
    _T54 = *(_T37 + 0)
    _T55 = *(_T54 + 16)
    _T56 =  call _T55
    parm _T56
    call _PrintInt
    parm _T36
    _T57 = *(_T36 + 0)
    _T58 = *(_T57 + 16)
    _T59 =  call _T58
    parm _T59
    call _PrintInt
    parm _T37
    _T60 = *(_T37 + 0)
    _T61 = *(_T60 + 24)
    _T62 =  call _T61
    parm _T62
    call _PrintInt
    parm _T36
    _T63 = *(_T36 + 0)
    _T64 = *(_T63 + 24)
    _T65 =  call _T64
    parm _T65
    call _PrintInt
    _T66 = "\n"
    parm _T66
    call _PrintString
    _T67 = 4
    parm _T37
    parm _T67
    _T68 = *(_T37 + 0)
    _T69 = *(_T68 + 20)
    call _T69
    _T70 = 3
    parm _T37
    parm _T70
    _T71 = *(_T37 + 0)
    _T72 = *(_T71 + 12)
    call _T72
    parm _T37
    _T73 = *(_T37 + 0)
    _T74 = *(_T73 + 16)
    _T75 =  call _T74
    parm _T75
    call _PrintInt
    parm _T36
    _T76 = *(_T36 + 0)
    _T77 = *(_T76 + 16)
    _T78 =  call _T77
    parm _T78
    call _PrintInt
    parm _T37
    _T79 = *(_T37 + 0)
    _T80 = *(_T79 + 24)
    _T81 =  call _T80
    parm _T81
    call _PrintInt
    parm _T36
    _T82 = *(_T36 + 0)
    _T83 = *(_T82 + 24)
    _T84 =  call _T83
    parm _T84
    call _PrintInt
}

