Dim VALUE_SI as String = "SI"
Dim VALUE_VALUE_EMPTY as String = ""
Dim WORKSHEETS_FAMILY as String = "MATRIZ FAMILIAS"
Dim WORKSHEETS_BENEFICIARY as String = "MATRIZ BENEFICIARIO RURB FS ACT"

Private Sub btnBeneficiarios_Click()
    
    If (Len(txtNroDNI) < 8) Then
        MsgBox ("El DNI tiene que tener 8 digitos")
    Else
        Dim iFila As Long
        Dim ws As Worksheet
        Set ws = Worksheets(WORKSHEETS_BENEFICIARY)
        
        'Cuenta en toda la columna y encuenta la siguiente fila vacía
        iFila = ws.Cells(Rows.Count, 2).End(xlUp).Offset(1, 0).Row
        
        'Pasa los datos a la pestaña Matriz Familias a cada una de las celdas
        
        'Datos de la Familia
        ws.Cells(iFila, "A").Value = Me.txtCodFamB.Value
        ws.Cells(iFila, "B").Value = UCase(Me.txtApePat)
        ws.Cells(iFila, "C").Value = UCase(Me.txtApeMat.Value)
        ws.Cells(iFila, "D").Value = UCase(Me.txtNombre.Value)
        ws.Cells(iFila, "E").Value = Me.cboParentesco.Value
        ws.Cells(iFila, "F").Value = Me.txtNacimiento.Value
        ws.Cells(iFila, "H").Value = Me.cboSexo.Value
        ws.Cells(iFila, "I").Value = Me.cboTieneDNI.Value
        ws.Cells(iFila, "J").Value = Me.txtNroDNI.Value
        ws.Cells(iFila, "K").Value = Me.cboSeguro.Value
        ws.Cells(iFila, "L").Value = Me.cboEstado.Value
        ws.Cells(iFila, "M").Value = Me.cboLeeEscribe.Value
        ws.Cells(iFila, "N").Value = Me.cboEstudia.Value
        ws.Cells(iFila, "O").Value = Me.cboGrado.Value
        ws.Cells(iFila, "P").Value = Me.cboOcupacion.Value
        
        'SITUACION EDUCATIVA
        ws.Cells(iFila, "Q").Value = Me.cboPromovido.Value
        ws.Cells(iFila, "R").Value = Me.txtPromedio.Value
        ws.Cells(iFila, "S").Value = Me.txtRepetido.Value
        
        'SITUACION NUTRICIONAL
        ws.Cells(iFila, "T").Value = Me.txtPeso.Value
        ws.Cells(iFila, "U").Value = Me.txtTalla.Value
        
        
        ws.Cells(iFila, "V").Value = Me.cboDiscapacidad.Value
        ws.Cells(iFila, "W").Value = Me.cboGestante.Value
        ws.Cells(iFila, "X").Value = Me.cboLactante.Value
        ws.Cells(iFila, "Y").Value = Me.txtFechaIngre.Value
        ws.Cells(iFila, "AC").Value = Me.cboServicio.Value
        
        Select Case cboArtesania.Value
            Case VALUE_SI
                ws.Cells(iFila, "CN").Value = 1
            Case Else
                ws.Cells(iFila, "CN").Value = VALUE_EMPTY
        End Select
        
        Select Case cboCarpinteria.Value
            Case VALUE_SI
                ws.Cells(iFila, "CO").Value = 1
            Case Else
                ws.Cells(iFila, "CO").Value = VALUE_EMPTY
        End Select
        
        Select Case cboCeramicaFrio.Value
            Case VALUE_SI
                ws.Cells(iFila, "CP").Value = 1
            Case Else
                ws.Cells(iFila, "CP").Value = VALUE_EMPTY
        End Select
        
        Select Case cboComputacion.Value
            Case VALUE_SI
                ws.Cells(iFila, "CQ").Value = 1
            Case Else
                ws.Cells(iFila, "CQ").Value = VALUE_EMPTY
        End Select
        
        Select Case cboCosmetologia.Value
            Case VALUE_SI
                ws.Cells(iFila, "CR").Value = 1
            Case Else
                ws.Cells(iFila, "CR").Value = VALUE_EMPTY
        End Select
        
        Select Case cboIndVestido.Value
            Case VALUE_SI
                ws.Cells(iFila, "CS").Value = 1
            Case Else
                ws.Cells(iFila, "CS").Value = VALUE_EMPTY
        End Select
        
        Select Case cboDecoracionGlobos.Value
            Case VALUE_SI
                ws.Cells(iFila, "CT").Value = 1
            Case Else
                ws.Cells(iFila, "CT").Value = VALUE_EMPTY
        End Select
        
        Select Case cboJugueteria.Value
            Case VALUE_SI
                ws.Cells(iFila, "CU").Value = 1
            Case Else
                ws.Cells(iFila, "CU").Value = VALUE_EMPTY
        End Select
        
        Select Case cboCorteConfeccion.Value
            Case VALUE_SI
                ws.Cells(iFila, "CV").Value = 1
            Case Else
                ws.Cells(iFila, "CV").Value = VALUE_EMPTY
        End Select
        
        Select Case cboPanaderia.Value
            Case VALUE_SI
                ws.Cells(iFila, "CW").Value = 1
            Case Else
                ws.Cells(iFila, "CW").Value = VALUE_EMPTY
        End Select
        
        Select Case cboIndAlimentaria.Value
            Case VALUE_SI
                ws.Cells(iFila, "CX").Value = 1
            Case Else
                ws.Cells(iFila, "CX").Value = VALUE_EMPTY
        End Select
        
        Select Case cboTejidoMaquina.Value
            Case VALUE_SI
                ws.Cells(iFila, "CY").Value = 1
            Case Else
                ws.Cells(iFila, "CY").Value = VALUE_EMPTY
        End Select
        
        Select Case cboTejidoLana.Value
            Case VALUE_SI
                ws.Cells(iFila, "CZ").Value = 1
            Case Else
                ws.Cells(iFila, "CZ").Value = VALUE_EMPTY
        End Select
        
        Select Case cboTelares.Value
            Case VALUE_SI
                ws.Cells(iFila, "DA").Value = 1
            Case Else
                ws.Cells(iFila, "DA").Value = VALUE_EMPTY
        End Select
        
        Select Case cboReposteria.Value
            Case VALUE_SI
                ws.Cells(iFila, "DB").Value = 1
            Case Else
                ws.Cells(iFila, "DB").Value = VALUE_EMPTY
        End Select
        
        Select Case cboOtro.Value
            Case VALUE_SI
                ws.Cells(iFila, "DC").Value = 1
            Case Else
                ws.Cells(iFila, "DC").Value = VALUE_EMPTY
        End Select
       
        Select Case cboEscala.Value
            Case "A"
                ws.Cells(iFila, "EH").Value = 25
            Case "B"
                ws.Cells(iFila, "EH").Value = 20
            Case "C"
                ws.Cells(iFila, "EH").Value = 15
            Case "D"
                ws.Cells(iFila, "EH").Value = 10
            Case "E"
                ws.Cells(iFila, "EH").Value = 5
            Case "Exon"
                ws.Cells(iFila, "EH").Value = 0
        End Select
            
        MsgBox ("Se guardo con exito el Beneficiario")
    End If
    
    
    
End Sub


Private Sub btnEditar_Click()

If (Len(txtNroDNI) < 8) Then
        MsgBox ("El DNI tiene que tener 8 digitos")
    Else
         Set ws = Sheets(WORKSHEETS_BENEFICIARY)
         Set iFila = ws.Columns("J").Find(TextBox1, lookat:=xlWhole)
        
         If Not iFila Is Nothing Then
             
             ws.Cells(iFila.Row, "A").Value = Me.txtCodFamB.Value
             ws.Cells(iFila.Row, "B").Value = UCase(Me.txtApePat)
             ws.Cells(iFila.Row, "C").Value = UCase(Me.txtApeMat.Value)
             ws.Cells(iFila.Row, "D").Value = UCase(Me.txtNombre.Value)
             ws.Cells(iFila.Row, "E").Value = Me.cboParentesco.Value
             ws.Cells(iFila.Row, "F").Value = CDate(Me.txtNacimiento.Value)
             ws.Cells(iFila.Row, "H").Value = Me.cboSexo.Value
             ws.Cells(iFila.Row, "I").Value = Me.cboTieneDNI.Value
             ws.Cells(iFila.Row, "J").Value = Me.txtNroDNI.Value
             ws.Cells(iFila.Row, "K").Value = Me.cboSeguro.Value
             ws.Cells(iFila.Row, "L").Value = Me.cboEstado.Value
             ws.Cells(iFila.Row, "M").Value = Me.cboLeeEscribe.Value
             ws.Cells(iFila.Row, "N").Value = Me.cboEstudia.Value
             ws.Cells(iFila.Row, "O").Value = Me.cboGrado.Value
             ws.Cells(iFila.Row, "P").Value = Me.cboOcupacion.Value
             
             'SITUACION EDUCATIVA
             ws.Cells(iFila.Row, "Q").Value = Me.cboPromovido.Value
             ws.Cells(iFila.Row, "R").Value = Me.txtPromedio.Value
             ws.Cells(iFila.Row, "S").Value = Me.txtRepetido.Value
             
             'SITUACION NUTRICIONAL
             ws.Cells(iFila.Row, "T").Value = Me.txtPeso.Value
             ws.Cells(iFila.Row, "U").Value = Me.txtTalla.Value
             
             
             ws.Cells(iFila.Row, "V").Value = Me.cboDiscapacidad.Value
             ws.Cells(iFila.Row, "W").Value = Me.cboGestante.Value
             ws.Cells(iFila.Row, "X").Value = Me.cboLactante.Value
             ws.Cells(iFila.Row, "Y").Value = CDate(Me.txtFechaIngre.Value)
             ws.Cells(iFila.Row, "AC").Value = Me.cboServicio.Value
             
             Select Case cboArtesania.Value
                 Case VALUE_SI
                     ws.Cells(iFila.Row, "CN").Value = 1
                 Case Else
                     ws.Cells(iFila.Row, "CN").Value = VALUE_EMPTY
             End Select
             
             Select Case cboCarpinteria.Value
                 Case VALUE_SI
                     ws.Cells(iFila.Row, "CO").Value = 1
                 Case Else
                     ws.Cells(iFila.Row, "CO").Value = VALUE_EMPTY
             End Select
             
             Select Case cboCeramicaFrio.Value
                 Case VALUE_SI
                     ws.Cells(iFila.Row, "CP").Value = 1
                 Case Else
                     ws.Cells(iFila.Row, "CP").Value = VALUE_EMPTY
             End Select
             
             Select Case cboComputacion.Value
                 Case VALUE_SI
                     ws.Cells(iFila.Row, "CQ").Value = 1
                 Case Else
                     ws.Cells(iFila.Row, "CQ").Value = VALUE_EMPTY
             End Select
             
             Select Case cboCosmetologia.Value
                 Case VALUE_SI
                     ws.Cells(iFila.Row, "CR").Value = 1
                 Case Else
                     ws.Cells(iFila.Row, "CR").Value = VALUE_EMPTY
             End Select
             
             Select Case cboIndVestido.Value
                 Case VALUE_SI
                     ws.Cells(iFila.Row, "CS").Value = 1
                 Case Else
                     ws.Cells(iFila.Row, "CS").Value = VALUE_EMPTY
             End Select
             
             Select Case cboDecoracionGlobos.Value
                 Case VALUE_SI
                     ws.Cells(iFila.Row, "CT").Value = 1
                 Case Else
                     ws.Cells(iFila.Row, "CT").Value = VALUE_EMPTY
             End Select
             
             Select Case cboJugueteria.Value
                 Case VALUE_SI
                     ws.Cells(iFila.Row, "CU").Value = 1
                 Case Else
                     ws.Cells(iFila.Row, "CU").Value = VALUE_EMPTY
             End Select
             
             Select Case cboCorteConfeccion.Value
                 Case VALUE_SI
                     ws.Cells(iFila.Row, "CV").Value = 1
                 Case Else
                     ws.Cells(iFila.Row, "CV").Value = VALUE_EMPTY
             End Select
             
             Select Case cboPanaderia.Value
                 Case VALUE_SI
                     ws.Cells(iFila.Row, "CW").Value = 1
                 Case Else
                     ws.Cells(iFila.Row, "CW").Value = VALUE_EMPTY
             End Select
             
             Select Case cboIndAlimentaria.Value
                 Case VALUE_SI
                     ws.Cells(iFila.Row, "CX").Value = 1
                 Case Else
                     ws.Cells(iFila.Row, "CX").Value = VALUE_EMPTY
             End Select
             
             Select Case cboTejidoMaquina.Value
                 Case VALUE_SI
                     ws.Cells(iFila.Row, "CY").Value = 1
                 Case Else
                     ws.Cells(iFila.Row, "CY").Value = VALUE_EMPTY
             End Select
             
             Select Case cboTejidoLana.Value
                 Case VALUE_SI
                     ws.Cells(iFila.Row, "CZ").Value = 1
                 Case Else
                     ws.Cells(iFila.Row, "CZ").Value = VALUE_EMPTY
             End Select
             
             Select Case cboTelares.Value
                 Case VALUE_SI
                     ws.Cells(iFila.Row, "DA").Value = 1
                 Case Else
                     ws.Cells(iFila.Row, "DA").Value = VALUE_EMPTY
             End Select
             
             Select Case cboReposteria.Value
                 Case VALUE_SI
                     ws.Cells(iFila.Row, "DB").Value = 1
                 Case Else
                     ws.Cells(iFila.Row, "DB").Value = VALUE_EMPTY
             End Select
             
             Select Case cboOtro.Value
                 Case VALUE_SI
                     ws.Cells(iFila.Row, "DC").Value = 1
                 Case Else
                     ws.Cells(iFila.Row, "DC").Value = VALUE_EMPTY
             End Select
             
             
             Select Case cboEscala.Value
                 Case "A"
                     ws.Cells(iFila.Row, 138).Value = 25
                 Case "B"
                     ws.Cells(iFila.Row, 138).Value = 20
                 Case "C"
                     ws.Cells(iFila.Row, 138).Value = 15
                 Case "D"
                     ws.Cells(iFila.Row, 138).Value = 10
                 Case "E"
                     ws.Cells(iFila.Row, 138).Value = 5
                 Case "Exon"
                     ws.Cells(iFila.Row, 138).Value = 0
             End Select
             
             
         End If
         MsgBox "Datos actualizados"
    End If
End Sub

Private Sub btnLimpiarBeneficiario_Click()
    Me.txtCodFamB.Value = VALUE_EMPTY
    Me.txtApePat.Value = VALUE_EMPTY
    Me.txtApeMat.Value = VALUE_EMPTY
    Me.txtNombre.Value = VALUE_EMPTY
    Me.cboParentesco.Value = VALUE_EMPTY
    Me.txtNacimiento.Value = VALUE_EMPTY
    Me.cboSexo.Value = VALUE_EMPTY
    Me.cboTieneDNI.Value = "NO"
    Me.txtNroDNI.Value = VALUE_EMPTY
    Me.cboSeguro.Value = VALUE_EMPTY
    Me.cboEstado.Value = VALUE_EMPTY
    Me.cboLeeEscribe.Value = VALUE_EMPTY
    Me.cboEstudia.Value = VALUE_EMPTY
    Me.cboGrado.Value = VALUE_EMPTY
    Me.cboOcupacion.Value = VALUE_EMPTY
    
    'SITUACION EDUCATIVA
    Me.cboPromovido.Value = VALUE_EMPTY
    Me.txtPromedio.Value = VALUE_EMPTY
    Me.txtRepetido.Value = VALUE_EMPTY
    
    'SITUACION NUTRICIONAL
    Me.txtPeso.Value = VALUE_EMPTY
    Me.txtTalla.Value = VALUE_EMPTY
    
    
    Me.cboDiscapacidad.Value = VALUE_EMPTY
    Me.cboGestante.Value = VALUE_EMPTY
    Me.cboLactante.Value = VALUE_EMPTY
    Me.txtFechaIngre.Value = VALUE_EMPTY
    Me.cboServicio.Value = VALUE_EMPTY
    
    

End Sub

Private Sub btnLimpiarFamilias_Click()
    Me.txtCodFamF.Value = VALUE_EMPTY
    Me.txtApeFam.Value = VALUE_EMPTY
    Me.txtDepartamento.Value = VALUE_EMPTY
    Me.txtProvincia.Value = VALUE_EMPTY
    Me.txtDistrito.Value = VALUE_EMPTY
    Me.txtDireccion.Value = VALUE_EMPTY
    Me.cboUbiGeo.Value = VALUE_EMPTY
    Me.txtCelular.Value = VALUE_EMPTY
    Me.cboMotIng.Value = VALUE_EMPTY
    Me.cboAccesoCEDIF.Value = VALUE_EMPTY
    Me.cboTipoFam.Value = VALUE_EMPTY
    Me.cboJefFam.Value = VALUE_EMPTY
    
    'Datos de la Vivienda
    Me.txtHogares.Value = VALUE_EMPTY
    Me.cboUbicaVi.Value = VALUE_EMPTY
    Me.cboVivienda.Value = VALUE_EMPTY
    Me.cboTipoVivi.Value = VALUE_EMPTY
    Me.cboMaterial.Value = VALUE_EMPTY
    Me.cboAgua.Value = VALUE_EMPTY
    Me.cboAlumbrado.Value = VALUE_EMPTY
    Me.cboServHig.Value = VALUE_EMPTY
    Me.txtTotalHab.Value = VALUE_EMPTY
    Me.txtHabDorm.Value = VALUE_EMPTY
    Me.cboPisos.Value = VALUE_EMPTY
    Me.cboTechos.Value = VALUE_EMPTY
    
    'COMPOSICION Y CARACTERISTICAS DE LOS INTEGRANTES DEL HOGAR
    Me.txtNroInteFam.Value = VALUE_EMPTY
    Me.txtNomJefeFam.Value = VALUE_EMPTY
    Me.txtNomTutorFam.Value = VALUE_EMPTY
    
    'SALUD DE LA FAMILIA
    Me.cboIntegrante.Value = "NO"
    Me.cboPresentaEnfermedad.Value = VALUE_EMPTY
    Me.cboProblemasSalud.Value = VALUE_EMPTY
    Me.txtDiagnostico.Value = VALUE_EMPTY
    Me.txtEstablecimiento.Value = VALUE_EMPTY
    Me.txtTratamiento.Value = VALUE_EMPTY
    Me.cboNoRecibeAtencion.Value = VALUE_EMPTY
    
    'SITUACION ECONOMICA
    Me.cboCuentaIngresos.Value = VALUE_EMPTY
    Me.txtAportan.Value = VALUE_EMPTY
    Me.txtDependen.Value = VALUE_EMPTY
    Me.txtIngresosMensuales.Value = VALUE_EMPTY
    Me.txtEgresosMensuales.Value = VALUE_EMPTY
    
    'PROBLEMAS SOCIO FAMILIARES
    Me.cboDF.Value = VALUE_EMPTY
    Me.cboVF.Value = VALUE_EMPTY
    Me.cboDFM.Value = VALUE_EMPTY
    Me.cboMIF.Value = VALUE_EMPTY
    Me.cboCD.Value = VALUE_EMPTY
    Me.cboAPM.Value = VALUE_EMPTY
    Me.cboCF.Value = VALUE_EMPTY
    Me.cboFC.Value = VALUE_EMPTY
    Me.cboAusenciaPadre.Value = VALUE_EMPTY
    Me.cboAtiendeAdultoMayor.Value = VALUE_EMPTY
    
    
    
    Me.cboMotIngPri.Value = VALUE_EMPTY
    Me.cboMotIngSec.Value = VALUE_EMPTY
    Me.txtFechaIngreso.Value = VALUE_EMPTY
End Sub

Private Sub btnRegistrarFamilias_Click()
    Dim iFila As Long
    Dim ws As Worksheet
    Set ws = Worksheets(WORKSHEETS_FAMILY)
    
    'Cuenta en toda la columna y encuenta la siguiente fila vacía
    iFila = ws.Cells(Rows.Count, 2).End(xlUp).Offset(1, 0).Row
    
    'Pasa los datos a la pestaña Matriz Familias a cada una de las celdas
    
    'Datos de la Familia
    ws.Cells(iFila, 1).Value = Me.txtCodFamF.Value
    ws.Cells(iFila, 2).Value = UCase(Me.txtApeFam.Value)
    ws.Cells(iFila, 3).Value = UCase(Me.txtDepartamento.Value)
    ws.Cells(iFila, 4).Value = UCase(Me.txtProvincia.Value)
    ws.Cells(iFila, 5).Value = UCase(Me.txtDistrito.Value)
    ws.Cells(iFila, 6).Value = UCase(Me.txtDireccion.Value)
    ws.Cells(iFila, 7).Value = Me.cboUbiGeo.Value
    ws.Cells(iFila, 8).Value = Me.txtCelular.Value
    ws.Cells(iFila, 9).Value = Me.cboMotIng.Value
    ws.Cells(iFila, 10).Value = Me.cboAccesoCEDIF.Value
    ws.Cells(iFila, 11).Value = Me.cboTipoFam.Value
    ws.Cells(iFila, 12).Value = Me.cboJefFam.Value
    
    'Datos de la Vivienda
    ws.Cells(iFila, 13).Value = Me.txtHogares.Value
    ws.Cells(iFila, 14).Value = Me.cboUbicaVi.Value
    ws.Cells(iFila, 15).Value = Me.cboVivienda.Value
    ws.Cells(iFila, 16).Value = Me.cboTipoVivi.Value
    ws.Cells(iFila, 17).Value = Me.cboMaterial.Value
    ws.Cells(iFila, 18).Value = Me.cboAgua.Value
    ws.Cells(iFila, 19).Value = Me.cboAlumbrado.Value
    ws.Cells(iFila, 20).Value = Me.cboServHig.Value
    ws.Cells(iFila, 21).Value = Me.txtTotalHab.Value
    ws.Cells(iFila, 22).Value = Me.txtHabDorm.Value
    ws.Cells(iFila, 23).Value = Me.cboPisos.Value
    ws.Cells(iFila, 24).Value = Me.cboTechos.Value
    
    'COMPOSICION Y CARACTERISTICAS DE LOS INTEGRANTES DEL HOGAR
    ws.Cells(iFila, 25).Value = Me.txtNroInteFam.Value
    ws.Cells(iFila, 26).Value = UCase(Me.txtNomJefeFam.Value)
    ws.Cells(iFila, 27).Value = UCase(Me.txtNomTutorFam.Value)
    
    'SALUD DE LA FAMILIA
    ws.Cells(iFila, 28).Value = Me.cboIntegrante.Value
    ws.Cells(iFila, 29).Value = Me.cboPresentaEnfermedad.Value
    ws.Cells(iFila, 30).Value = Me.cboProblemasSalud.Value
    ws.Cells(iFila, 31).Value = UCase(Me.txtDiagnostico.Value)
    ws.Cells(iFila, 32).Value = UCase(Me.txtEstablecimiento.Value)
    ws.Cells(iFila, 33).Value = UCase(Me.txtTratamiento.Value)
    ws.Cells(iFila, 34).Value = Me.cboNoRecibeAtencion.Value
    
    'SITUACION ECONOMICA
    ws.Cells(iFila, 35).Value = Me.cboCuentaIngresos.Value
    ws.Cells(iFila, 36).Value = Me.txtAportan.Value
    ws.Cells(iFila, 37).Value = Me.txtDependen.Value
    ws.Cells(iFila, 38).Value = Me.txtIngresosMensuales.Value
    ws.Cells(iFila, 39).Value = Me.txtEgresosMensuales.Value
    
    'PROBLEMAS SOCIO FAMILIARES
    ws.Cells(iFila, 40).Value = Me.cboDF.Value
    ws.Cells(iFila, 41).Value = Me.cboVF.Value
    ws.Cells(iFila, 42).Value = Me.cboDFM.Value
    ws.Cells(iFila, 43).Value = Me.cboMIF.Value
    ws.Cells(iFila, 44).Value = Me.cboCD.Value
    ws.Cells(iFila, 45).Value = Me.cboAPM.Value
    ws.Cells(iFila, 46).Value = Me.cboCF.Value
    ws.Cells(iFila, 47).Value = Me.cboFC.Value
    ws.Cells(iFila, 48).Value = Me.cboAusenciaPadre.Value
    ws.Cells(iFila, 49).Value = Me.cboAtiendeAdultoMayor.Value
    
    
    
    ws.Cells(iFila, 71).Value = Me.cboMotIngPri.Value
    ws.Cells(iFila, 72).Value = Me.cboMotIngSec.Value
    ws.Cells(iFila, 73).Value = Me.txtFechaIngreso.Value
    
    MsgBox ("Se guardo con exito la Familia")
        
End Sub

Private Sub btnValidarDNI_Click()
    Set H = Sheets(WORKSHEETS_BENEFICIARY)
    Set b = H.Columns("J").Find(TxtValDNI.Value)
    If Not b Is Nothing Then
        lblMensaje.Caption = "Existe en el RUB"
        'Me.btnRegistrarBeneficiario.Enabled = False
        
        Me.txtCodFamB.Value = H.Cells(b.Row, "A")
        Me.txtApePat.Value = H.Cells(b.Row, "B")
        Me.txtApeMat.Value = H.Cells(b.Row, "C")
        Me.txtNombre.Value = H.Cells(b.Row, "D")
        Me.cboParentesco.Value = H.Cells(b.Row, "E")
        Me.txtNacimiento.Value = H.Cells(b.Row, "F")
        Me.cboSexo.Value = H.Cells(b.Row, "H")
        Me.cboTieneDNI.Value = H.Cells(b.Row, "I")
        Me.txtNroDNI.Value = H.Cells(b.Row, "J")
        Me.cboSeguro.Value = H.Cells(b.Row, "K")
        Me.cboEstado.Value = H.Cells(b.Row, "L")
        Me.cboLeeEscribe.Value = H.Cells(b.Row, "M")
        Me.cboEstudia.Value = H.Cells(b.Row, "N")
        Me.cboGrado.Value = H.Cells(b.Row, "O")
        Me.cboOcupacion.Value = H.Cells(b.Row, "P")
        
        'SITUACION EDUCATIVA
        Me.cboPromovido.Value = H.Cells(b.Row, "Q")
        Me.txtPromedio.Value = H.Cells(b.Row, "R")
        Me.txtRepetido.Value = H.Cells(b.Row, "S")
        
        'SITUACION NUTRICIONAL
        Me.txtPeso.Value = H.Cells(b.Row, "T")
        Me.txtTalla.Value = H.Cells(b.Row, "U")
        
        
        Me.cboDiscapacidad.Value = H.Cells(b.Row, "V")
        Me.cboGestante.Value = H.Cells(b.Row, "W")
        Me.cboLactante.Value = H.Cells(b.Row, "X")
        Me.txtFechaIngre.Value = H.Cells(b.Row, "Y")
        Me.cboServicio.Value = H.Cells(b.Row, "AC")
        
        Select Case H.Cells(b.Row, "CN")
            Case 1
                cboArtesania.Value = VALUE_SI
            Case Else
                cboArtesania.Value = VALUE_EMPTY
        End Select
        
        Select Case H.Cells(b.Row, "CO")
            Case 1
                cboCarpinteria.Value = VALUE_SI
            Case Else
                cboCarpinteria.Value = VALUE_EMPTY
        End Select
        
        Select Case H.Cells(b.Row, "CP")
            Case 1
                cboCeramicaFrio.Value = VALUE_SI
            Case Else
                cboCeramicaFrio.Value = VALUE_EMPTY
        End Select
        
        Select Case H.Cells(b.Row, "CQ")
            Case 1
                cboComputacion.Value = VALUE_SI
            Case Else
                cboComputacion.Value = VALUE_EMPTY
        End Select
        
        Select Case H.Cells(b.Row, "CR")
            Case 1
                cboCosmetologia.Value = VALUE_SI
            Case Else
                cboCosmetologia.Value = VALUE_EMPTY
        End Select
        
        Select Case H.Cells(b.Row, "CS")
            Case 1
                cboIndVestido.Value = VALUE_SI
            Case Else
                cboIndVestido.Value = VALUE_EMPTY
        End Select
        
        Select Case H.Cells(b.Row, "CT")
            Case 1
                cboDecoracionGlobos.Value = VALUE_SI
            Case Else
                cboDecoracionGlobos.Value = VALUE_EMPTY
        End Select
        
        Select Case H.Cells(b.Row, "CU")
            Case 1
                cboJugueteria.Value = VALUE_SI
            Case Else
                cboJugueteria.Value = VALUE_EMPTY
        End Select
        
        Select Case H.Cells(b.Row, "CV")
            Case 1
                cboCorteConfeccion.Value = VALUE_SI
            Case Else
                cboCorteConfeccion.Value = VALUE_EMPTY
        End Select
        
        Select Case H.Cells(b.Row, "CW")
            Case 1
                cboPanaderia.Value = VALUE_SI
            Case Else
                cboPanaderia.Value = VALUE_EMPTY
        End Select
        
        Select Case H.Cells(b.Row, "CX")
            Case 1
                cboIndAlimentaria.Value = VALUE_SI
            Case Else
                cboIndAlimentaria.Value = VALUE_EMPTY
        End Select
        
        Select Case H.Cells(b.Row, "CY")
            Case 1
                cboTejidoMaquina.Value = VALUE_SI
            Case Else
                cboTejidoMaquina.Value = VALUE_EMPTY
        End Select
        
        Select Case H.Cells(b.Row, "CZ")
            Case 1
                cboTejidoLana.Value = VALUE_SI
            Case Else
                cboTejidoLana.Value = VALUE_EMPTY
        End Select
        
        Select Case H.Cells(b.Row, "DA")
            Case 1
                cboTelares.Value = VALUE_SI
            Case Else
                cboTelares.Value = VALUE_EMPTY
        End Select
        
        Select Case H.Cells(b.Row, "DB")
            Case 1
                cboReposteria.Value = VALUE_SI
            Case Else
                cboReposteria.Value = VALUE_EMPTY
        End Select
        
        Select Case H.Cells(b.Row, "DC")
            Case 1
                cboOtro.Value = VALUE_SI
            Case Else
                cboOtro.Value = VALUE_EMPTY
        End Select
                
        Select Case H.Cells(b.Row, "EH")
            Case 25
                Me.cboEscala.Value = "A"
            Case 20
                Me.cboEscala.Value = "B"
            Case 15
                Me.cboEscala.Value = "C"
            Case 10
                Me.cboEscala.Value = "D"
            Case 5
                Me.cboEscala.Value = "E"
            Case 0
                Me.cboEscala.Value = "Exon"
        End Select
        
        Me.btnRegistrarFamilias.Enabled = False
        Me.btnRegistrarFamilias.BackColor = &H8000000F
        
        Me.btnBeneficiarios.Enabled = False
        Me.btnBeneficiarios.BackColor = &H8000000F
        
        Me.btnEditar.Enabled = True
        Me.btnEditar.BackColor = &H8000000D
    Else
        lblMensaje.Caption = "No existe en el RUB"
        'Me.btnRegistrarBeneficiario.Enabled = True
        
        Me.txtCodFamB.Value = VALUE_EMPTY
        Me.txtApePat.Value = VALUE_EMPTY
        Me.txtApeMat.Value = VALUE_EMPTY
        Me.txtNombre.Value = VALUE_EMPTY
        Me.cboParentesco.Value = VALUE_EMPTY
        Me.txtNacimiento.Value = VALUE_EMPTY
        Me.cboSexo.Value = VALUE_EMPTY
        Me.cboTieneDNI.Value = VALUE_SI
        Me.txtNroDNI.Value = Me.TxtValDNI.Value
        txtNroDNI.Enabled = True
        txtNroDNI.BackColor = &H80000005
        'txtNroDNI.Locked = True
        Me.cboSeguro.Value = VALUE_EMPTY
        Me.cboEstado.Value = VALUE_EMPTY
        Me.cboLeeEscribe.Value = VALUE_EMPTY
        Me.cboEstudia.Value = VALUE_EMPTY
        Me.cboGrado.Value = VALUE_EMPTY
        Me.cboOcupacion.Value = VALUE_EMPTY
        
        'SITUACION EDUCATIVA
        Me.cboPromovido.Value = VALUE_EMPTY
        Me.txtPromedio.Value = VALUE_EMPTY
        Me.txtRepetido.Value = VALUE_EMPTY
        
        'SITUACION NUTRICIONAL
        Me.txtPeso.Value = VALUE_EMPTY
        Me.txtTalla.Value = VALUE_EMPTY
        
        
        Me.cboDiscapacidad.Value = VALUE_EMPTY
        Me.cboGestante.Value = VALUE_EMPTY
        Me.cboLactante.Value = VALUE_EMPTY
        Me.txtFechaIngre.Value = VALUE_EMPTY
        Me.cboServicio.Value = VALUE_EMPTY
        
        
        Me.btnRegistrarFamilias.Enabled = True
        Me.btnRegistrarFamilias.BackColor = &H8000000D
        Me.btnBeneficiarios.Enabled = True
        Me.btnBeneficiarios.BackColor = &H8000000D
        Me.btnEditar.Enabled = False
        Me.btnEditar.BackColor = &H8000000F
        
    End If
   
   
    If (TxtValDNI.Value = VALUE_EMPTY) Then
        lblMensaje.Caption = VALUE_EMPTY
        
        Me.txtCodFamB.Value = VALUE_EMPTY
        Me.txtApePat.Value = VALUE_EMPTY
        Me.txtApeMat.Value = VALUE_EMPTY
        Me.txtNombre.Value = VALUE_EMPTY
        Me.cboParentesco.Value = VALUE_EMPTY
        Me.txtNacimiento.Value = VALUE_EMPTY
        Me.cboSexo.Value = VALUE_EMPTY
        Me.cboTieneDNI.Value = "NO"
        Me.txtNroDNI.Value = VALUE_EMPTY
        txtNroDNI.Enabled = False
        txtNroDNI.BackColor = &H8000000F
        Me.cboSeguro.Value = VALUE_EMPTY
        Me.cboEstado.Value = VALUE_EMPTY
        Me.cboLeeEscribe.Value = VALUE_EMPTY
        Me.cboEstudia.Value = VALUE_EMPTY
        Me.cboGrado.Value = VALUE_EMPTY
        Me.cboOcupacion.Value = VALUE_EMPTY
        
        'SITUACION EDUCATIVA
        Me.cboPromovido.Value = VALUE_EMPTY
        Me.txtPromedio.Value = VALUE_EMPTY
        Me.txtRepetido.Value = VALUE_EMPTY
        
        'SITUACION NUTRICIONAL
        Me.txtPeso.Value = VALUE_EMPTY
        Me.txtTalla.Value = VALUE_EMPTY
        
        
        Me.cboDiscapacidad.Value = VALUE_EMPTY
        Me.cboGestante.Value = VALUE_EMPTY
        Me.cboLactante.Value = VALUE_EMPTY
        Me.txtFechaIngre.Value = VALUE_EMPTY
        Me.cboServicio.Value = VALUE_EMPTY
        
        
        Me.btnRegistrarFamilias.Enabled = False
        Me.btnRegistrarFamilias.BackColor = &H8000000F
        Me.btnBeneficiarios.Enabled = False
        Me.btnBeneficiarios.BackColor = &H8000000F
        Me.btnEditar.Enabled = False
        Me.btnEditar.BackColor = &H8000000F
        
        MsgBox ("El DNI debe tener un numero")
    
    ElseIf (Len(TxtValDNI) < 8) Then
        MsgBox ("DNI Incompleto")
        
        Me.btnRegistrarFamilias.Enabled = False
        Me.btnRegistrarFamilias.BackColor = &H8000000F
        Me.btnBeneficiarios.Enabled = False
        Me.btnBeneficiarios.BackColor = &H8000000F
        Me.btnEditar.Enabled = False
        Me.btnEditar.BackColor = &H8000000F
        
        lblMensaje.Caption = VALUE_EMPTY
        
        Me.txtCodFamB.Value = VALUE_EMPTY
        Me.txtApePat.Value = VALUE_EMPTY
        Me.txtApeMat.Value = VALUE_EMPTY
        Me.txtNombre.Value = VALUE_EMPTY
        Me.cboParentesco.Value = VALUE_EMPTY
        Me.txtNacimiento.Value = VALUE_EMPTY
        Me.cboSexo.Value = VALUE_EMPTY
        Me.cboTieneDNI.Value = "NO"
        Me.txtNroDNI.Value = VALUE_EMPTY
        txtNroDNI.Enabled = False
        txtNroDNI.BackColor = &H8000000F
        Me.cboSeguro.Value = VALUE_EMPTY
        Me.cboEstado.Value = VALUE_EMPTY
        Me.cboLeeEscribe.Value = VALUE_EMPTY
        Me.cboEstudia.Value = VALUE_EMPTY
        Me.cboGrado.Value = VALUE_EMPTY
        Me.cboOcupacion.Value = VALUE_EMPTY
        
        'SITUACION EDUCATIVA
        Me.cboPromovido.Value = VALUE_EMPTY
        Me.txtPromedio.Value = VALUE_EMPTY
        Me.txtRepetido.Value = VALUE_EMPTY
        
        'SITUACION NUTRICIONAL
        Me.txtPeso.Value = VALUE_EMPTY
        Me.txtTalla.Value = VALUE_EMPTY
        
        
        Me.cboDiscapacidad.Value = VALUE_EMPTY
        Me.cboGestante.Value = VALUE_EMPTY
        Me.cboLactante.Value = VALUE_EMPTY
        Me.txtFechaIngre.Value = VALUE_EMPTY
        Me.cboServicio.Value = VALUE_EMPTY
    End If
    
End Sub

Private Sub cboIntegrante_Change()
    If (cboIntegrante.Value = "NO") Then
    
        cboPresentaEnfermedad.Enabled = False
        cboPresentaEnfermedad.BackColor = &H8000000F
        cboPresentaEnfermedad.Value = VALUE_EMPTY
        
        cboProblemasSalud.Enabled = False
        cboProblemasSalud.BackColor = &H8000000F
        cboProblemasSalud.Value = VALUE_EMPTY
        
        txtDiagnostico.Enabled = False
        txtDiagnostico.BackColor = &H8000000F
        txtDiagnostico.Value = VALUE_EMPTY
        
        txtEstablecimiento.Enabled = False
        txtEstablecimiento.BackColor = &H8000000F
        txtEstablecimiento.Value = VALUE_EMPTY
        
        txtTratamiento.Enabled = False
        txtTratamiento.BackColor = &H8000000F
        txtTratamiento.Value = VALUE_EMPTY
        
        cboNoRecibeAtencion.Enabled = False
        cboNoRecibeAtencion.BackColor = &H8000000F
        cboNoRecibeAtencion.Value = VALUE_EMPTY
        
    Else
        
        cboPresentaEnfermedad.Enabled = True
        cboPresentaEnfermedad.BackColor = &H80000005
        
        cboProblemasSalud.Enabled = True
        cboProblemasSalud.BackColor = &H80000005
        
        txtDiagnostico.Enabled = True
        txtDiagnostico.BackColor = &H80000005
        
        txtEstablecimiento.Enabled = True
        txtEstablecimiento.BackColor = &H80000005
        
        txtTratamiento.Enabled = True
        txtTratamiento.BackColor = &H80000005
        
        cboNoRecibeAtencion.Enabled = True
        cboNoRecibeAtencion.BackColor = &H80000005
    End If
End Sub

Private Sub cboServicio_Change()
    If (cboServicio.Value = "Taller de Capacitación Ocupacional") Then
        
        cboArtesania.Enabled = True
        cboArtesania.BackColor = &H80000005
    
        cboCarpinteria.Enabled = True
        cboCarpinteria.BackColor = &H80000005
    
        cboCeramicaFrio.Enabled = True
        cboCeramicaFrio.BackColor = &H80000005
    
        cboComputacion.Enabled = True
        cboComputacion.BackColor = &H80000005
    
        cboCosmetologia.Enabled = True
        cboCosmetologia.BackColor = &H80000005
    
        cboIndVestido.Enabled = True
        cboIndVestido.BackColor = &H80000005
    
        cboDecoracionGlobos.Enabled = True
        cboDecoracionGlobos.BackColor = &H80000005
    
        cboJugueteria.Enabled = True
        cboJugueteria.BackColor = &H80000005
    
        cboCorteConfeccion.Enabled = True
        cboCorteConfeccion.BackColor = &H80000005
    
        cboPanaderia.Enabled = True
        cboPanaderia.BackColor = &H80000005
    
        cboIndAlimentaria.Enabled = True
        cboIndAlimentaria.BackColor = &H80000005
    
        cboTejidoMaquina.Enabled = True
        cboTejidoMaquina.BackColor = &H80000005
    
        cboTejidoLana.Enabled = True
        cboTejidoLana.BackColor = &H80000005
    
        cboTelares.Enabled = True
        cboTelares.BackColor = &H80000005
    
        cboReposteria.Enabled = True
        cboReposteria.BackColor = &H80000005
    
        cboOtro.Enabled = True
        cboOtro.BackColor = &H80000005
        
    Else
        
        cboArtesania.Enabled = False
        cboArtesania.BackColor = &H8000000F
    
        cboCarpinteria.Enabled = False
        cboCarpinteria.BackColor = &H8000000F
    
        cboCeramicaFrio.Enabled = False
        cboCeramicaFrio.BackColor = &H8000000F
    
        cboComputacion.Enabled = False
        cboComputacion.BackColor = &H8000000F
    
        cboCosmetologia.Enabled = False
        cboCosmetologia.BackColor = &H8000000F
    
        cboIndVestido.Enabled = False
        cboIndVestido.BackColor = &H8000000F
    
        cboDecoracionGlobos.Enabled = False
        cboDecoracionGlobos.BackColor = &H8000000F
    
        cboJugueteria.Enabled = False
        cboJugueteria.BackColor = &H8000000F
    
        cboCorteConfeccion.Enabled = False
        cboCorteConfeccion.BackColor = &H8000000F
    
        cboPanaderia.Enabled = False
        cboPanaderia.BackColor = &H8000000F
    
        cboIndAlimentaria.Enabled = False
        cboIndAlimentaria.BackColor = &H8000000F
    
        cboTejidoMaquina.Enabled = False
        cboTejidoMaquina.BackColor = &H8000000F
    
        cboTejidoLana.Enabled = False
        cboTejidoLana.BackColor = &H8000000F
    
        cboTelares.Enabled = False
        cboTelares.BackColor = &H8000000F
    
        cboReposteria.Enabled = False
        cboReposteria.BackColor = &H8000000F
    
        cboOtro.Enabled = False
        cboOtro.BackColor = &H8000000F
    End If
End Sub

Private Sub cboTieneDNI_Change()

    If (cboTieneDNI.Value = "NO") Then
        txtNroDNI.Enabled = False
        txtNroDNI.BackColor = &H8000000F
        txtNroDNI.Value = VALUE_EMPTY
    Else
        txtNroDNI.Enabled = True
        txtNroDNI.BackColor = &H80000005
    End If

End Sub

Private Sub txtApeFam_Change()
    Dim Texto As Variant
    Dim Caracter As Variant
    Dim Largo As String
    On Error Resume Next
    Texto = Me.txtApeFam.Value
    Largo = Len(Me.txtApeFam.Value)
    For i = 1 To Largo
        Caracter = CInt(Mid(Texto, i, 1))
        If Caracter <> VALUE_EMPTY Then
            If Not Application.WorksheetFunction.IsText(Caracter) Then
                Me.txtApeFam.Value = Replace(Texto, Caracter, VALUE_EMPTY)
            Else
            End If
        End If
    Next i
    On Error GoTo 0
End Sub

Private Sub txtDepartamento_Change()
    Dim Texto As Variant
    Dim Caracter As Variant
    Dim Largo As String
    On Error Resume Next
    Texto = Me.txtDepartamento.Value
    Largo = Len(Me.txtDepartamento.Value)
    For i = 1 To Largo
        Caracter = CInt(Mid(Texto, i, 1))
        If Caracter <> VALUE_EMPTY Then
            If Not Application.WorksheetFunction.IsText(Caracter) Then
                Me.txtDepartamento.Value = Replace(Texto, Caracter, VALUE_EMPTY)
            Else
            End If
        End If
    Next i
    On Error GoTo 0
End Sub

Private Sub txtDistrito_Change()
    Dim Texto As Variant
    Dim Caracter As Variant
    Dim Largo As String
    On Error Resume Next
    Texto = Me.txtDistrito.Value
    Largo = Len(Me.txtDistrito.Value)
    For i = 1 To Largo
        Caracter = CInt(Mid(Texto, i, 1))
        If Caracter <> VALUE_EMPTY Then
            If Not Application.WorksheetFunction.IsText(Caracter) Then
                Me.txtDistrito.Value = Replace(Texto, Caracter, VALUE_EMPTY)
            Else
            End If
        End If
    Next i
    On Error GoTo 0
End Sub

Private Sub txtProvincia_Change()
    Dim Texto As Variant
    Dim Caracter As Variant
    Dim Largo As String
    On Error Resume Next
    Texto = Me.txtProvincia.Value
    Largo = Len(Me.txtProvincia.Value)
    For i = 1 To Largo
        Caracter = CInt(Mid(Texto, i, 1))
        If Caracter <> VALUE_EMPTY Then
            If Not Application.WorksheetFunction.IsText(Caracter) Then
                Me.txtProvincia.Value = Replace(Texto, Caracter, VALUE_EMPTY)
            Else
            End If
        End If
    Next i
    On Error GoTo 0
End Sub

Private Sub TxtValDNI_Change()

    Me.TxtValDNI.MaxLength = 8
    
    Dim Texto As Variant
    Dim Caracter As Variant
    Dim Largo As Integer
    On Error Resume Next
    Texto = Me.TxtValDNI.Value
    Largo = Len(Me.TxtValDNI.Value)
    For i = 1 To Largo
        Caracter = Mid(Texto, i, 1)
        If Caracter <> VALUE_EMPTY Then
            If Caracter < Chr(48) Or Caracter > Chr(57) Then
                Me.TxtValDNI.Value = Replace(Texto, Caracter, VALUE_EMPTY)
            Else
            End If
        End If
    Next i
    On Error GoTo 0
    Caracter = 0
    Caracter1 = 0

End Sub

Private Sub txtApeMat_Change()
    Dim Texto As Variant
    Dim Caracter As Variant
    Dim Largo As String
    On Error Resume Next
    Texto = Me.txtApeMat.Value
    Largo = Len(Me.txtApeMat.Value)
    For i = 1 To Largo
        Caracter = CInt(Mid(Texto, i, 1))
        If Caracter <> VALUE_EMPTY Then
            If Not Application.WorksheetFunction.IsText(Caracter) Then
                Me.txtApeMat.Value = Replace(Texto, Caracter, VALUE_EMPTY)
            Else
            End If
        End If
    Next i
    On Error GoTo 0
End Sub

Private Sub txtApePat_Change()
    Dim Texto As Variant
    Dim Caracter As Variant
    Dim Largo As String
    On Error Resume Next
    Texto = Me.txtApePat.Value
    Largo = Len(Me.txtApePat.Value)
    For i = 1 To Largo
        Caracter = CInt(Mid(Texto, i, 1))
        If Caracter <> VALUE_EMPTY Then
            If Not Application.WorksheetFunction.IsText(Caracter) Then
                Me.txtApePat.Value = Replace(Texto, Caracter, VALUE_EMPTY)
            Else
            End If
        End If
    Next i
    On Error GoTo 0
End Sub

Private Sub txtNombre_Change()
    Dim Texto As Variant
    Dim Caracter As Variant
    Dim Largo As String
    On Error Resume Next
    Texto = Me.txtNombre.Value
    Largo = Len(Me.txtNombre.Value)
    For i = 1 To Largo
        Caracter = CInt(Mid(Texto, i, 1))
        If Caracter <> VALUE_EMPTY Then
            If Not Application.WorksheetFunction.IsText(Caracter) Then
                Me.txtNombre.Value = Replace(Texto, Caracter, VALUE_EMPTY)
            Else
            End If
        End If
    Next i
    On Error GoTo 0
End Sub

Private Sub txtNroDNI_Change()

    txtNroDNI.MaxLength = 8
    txtNroDNI.Locked = True
    
    Dim Texto As Variant
    Dim Caracter As Variant
    Dim Largo As Integer
    On Error Resume Next
    Texto = Me.txtNroDNI.Value
    Largo = Len(Me.txtNroDNI.Value)
    For i = 1 To Largo
        Caracter = Mid(Texto, i, 1)
        If Caracter <> VALUE_EMPTY Then
            If Caracter < Chr(48) Or Caracter > Chr(57) Then
                Me.txtNroDNI.Value = Replace(Texto, Caracter, VALUE_EMPTY)
            Else
            End If
        End If
    Next i
    On Error GoTo 0
    Caracter = 0
    Caracter1 = 0
    

End Sub

Private Sub UserForm_Initialize()

    Set ws = Worksheets("Validaciones")
    
    'Lista de Familia
    
    'Lista de Ubicación Geografica
    cboUbiGeo.AddItem (ws.Range("B283"))
    cboUbiGeo.AddItem (ws.Range("B284"))
    cboUbiGeo.AddItem (ws.Range("B285"))
    cboUbiGeo.AddItem (ws.Range("B286"))
    cboUbiGeo.AddItem (ws.Range("B287"))
    cboUbiGeo.AddItem (ws.Range("B288"))
    cboUbiGeo.AddItem (ws.Range("B289"))
    
    'Lista de Motivo que expresa el solicitante para ingresa al CEDIF
    cboMotIng.AddItem (ws.Range("B4"))
    cboMotIng.AddItem (ws.Range("B5"))
    cboMotIng.AddItem (ws.Range("B6"))
    cboMotIng.AddItem (ws.Range("B7"))
    cboMotIng.AddItem (ws.Range("B8"))
    cboMotIng.AddItem (ws.Range("B9"))
    cboMotIng.AddItem (ws.Range("B10"))
    cboMotIng.AddItem (ws.Range("B11"))
    cboMotIng.AddItem (ws.Range("B12"))
    cboMotIng.AddItem (ws.Range("B13"))
    cboMotIng.AddItem (ws.Range("B14"))
    cboMotIng.AddItem (ws.Range("B15"))
    
    'Lista de acceso de la familia al CEDIF
    cboAccesoCEDIF.AddItem (ws.Range("B18"))
    cboAccesoCEDIF.AddItem (ws.Range("B19"))
    cboAccesoCEDIF.AddItem (ws.Range("B20"))
    cboAccesoCEDIF.AddItem (ws.Range("B21"))
    cboAccesoCEDIF.AddItem (ws.Range("B22"))
    cboAccesoCEDIF.AddItem (ws.Range("B23"))
    cboAccesoCEDIF.AddItem (ws.Range("B24"))
    cboAccesoCEDIF.AddItem (ws.Range("B25"))
    cboAccesoCEDIF.AddItem (ws.Range("B26"))
    
    'Lista de tipo de Familia
    cboTipoFam.AddItem (ws.Range("B29"))
    cboTipoFam.AddItem (ws.Range("B30"))
    cboTipoFam.AddItem (ws.Range("B31"))
    cboTipoFam.AddItem (ws.Range("B32"))
    cboTipoFam.AddItem (ws.Range("B33"))
    cboTipoFam.AddItem (ws.Range("B34"))
    
    'Lista de Jefatura Familiar
    cboJefFam.AddItem (ws.Range("B37"))
    cboJefFam.AddItem (ws.Range("B38"))
    cboJefFam.AddItem (ws.Range("B39"))
    cboJefFam.AddItem (ws.Range("B40"))
    cboJefFam.AddItem (ws.Range("B41"))
    cboJefFam.AddItem (ws.Range("B42"))
    
    'Lista de Ubicación de la Vivienda
    cboUbicaVi.AddItem (ws.Range("B46"))
    cboUbicaVi.AddItem (ws.Range("B47"))
    cboUbicaVi.AddItem (ws.Range("B48"))
    cboUbicaVi.AddItem (ws.Range("B49"))
    cboUbicaVi.AddItem (ws.Range("B50"))
    cboUbicaVi.AddItem (ws.Range("B51"))
    cboUbicaVi.AddItem (ws.Range("B52"))
    cboUbicaVi.AddItem (ws.Range("B53"))
    cboUbicaVi.AddItem (ws.Range("B54"))
    cboUbicaVi.AddItem (ws.Range("B55"))

    'Lista de la Vivienda que Ocupa es
    cboVivienda.AddItem (ws.Range("B60"))
    cboVivienda.AddItem (ws.Range("B61"))
    cboVivienda.AddItem (ws.Range("B62"))
    cboVivienda.AddItem (ws.Range("B63"))
    cboVivienda.AddItem (ws.Range("B64"))

    'Lista de Tipo de Vivienda
    cboTipoVivi.AddItem (ws.Range("B67"))
    cboTipoVivi.AddItem (ws.Range("B68"))
    cboTipoVivi.AddItem (ws.Range("B69"))
    cboTipoVivi.AddItem (ws.Range("B70"))
    cboTipoVivi.AddItem (ws.Range("B71"))
    cboTipoVivi.AddItem (ws.Range("B72"))
    cboTipoVivi.AddItem (ws.Range("B73"))

    'Lista de Material de construccion en paredes exteriores
    cboMaterial.AddItem (ws.Range("B76"))
    cboMaterial.AddItem (ws.Range("B77"))
    cboMaterial.AddItem (ws.Range("B78"))
    cboMaterial.AddItem (ws.Range("B79"))
    cboMaterial.AddItem (ws.Range("B80"))
    cboMaterial.AddItem (ws.Range("B81"))
    
    'Lista El abastecimiento de agua en la vivienda procede de:
    cboAgua.AddItem (ws.Range("B84"))
    cboAgua.AddItem (ws.Range("B85"))
    cboAgua.AddItem (ws.Range("B86"))
    cboAgua.AddItem (ws.Range("B87"))
    cboAgua.AddItem (ws.Range("B88"))
    cboAgua.AddItem (ws.Range("B89"))
    cboAgua.AddItem (ws.Range("B90"))

    'Lista Tipo de alumbrado en la vivienda:
    cboAlumbrado.AddItem (ws.Range("B93"))
    cboAlumbrado.AddItem (ws.Range("B94"))
    cboAlumbrado.AddItem (ws.Range("B95"))
    cboAlumbrado.AddItem (ws.Range("B96"))
    cboAlumbrado.AddItem (ws.Range("B97"))
    cboAlumbrado.AddItem (ws.Range("B98"))

    'Lista El servicio higiénico que tiene la vivienda, está conectado a:
    cboServHig.AddItem (ws.Range("B101"))
    cboServHig.AddItem (ws.Range("B102"))
    cboServHig.AddItem (ws.Range("B103"))
    cboServHig.AddItem (ws.Range("B104"))
    cboServHig.AddItem (ws.Range("B105"))
    
    'Lista Material Predominante en los Pisos es
    cboPisos.AddItem (ws.Range("B108"))
    cboPisos.AddItem (ws.Range("B109"))
    cboPisos.AddItem (ws.Range("B110"))
    cboPisos.AddItem (ws.Range("B111"))

    'Lista Material Predominante en los Techos es
    cboTechos.AddItem (ws.Range("B114"))
    cboTechos.AddItem (ws.Range("B115"))
    cboTechos.AddItem (ws.Range("B116"))
    cboTechos.AddItem (ws.Range("B117"))
    cboTechos.AddItem (ws.Range("B118"))
    cboTechos.AddItem (ws.Range("B119"))
    cboTechos.AddItem (ws.Range("B120"))
    
    cboIntegrante.AddItem (ws.Range("K7"))
    cboIntegrante.AddItem (ws.Range("K8"))
    
    'Lista Quien presenta la enfermedad
    cboPresentaEnfermedad.AddItem (ws.Range("B125"))
    cboPresentaEnfermedad.AddItem (ws.Range("B126"))
    cboPresentaEnfermedad.AddItem (ws.Range("B127"))
    cboPresentaEnfermedad.AddItem (ws.Range("B128"))
    cboPresentaEnfermedad.AddItem (ws.Range("B129"))
    cboPresentaEnfermedad.AddItem (ws.Range("B130"))
    cboPresentaEnfermedad.AddItem (ws.Range("B131"))
    cboPresentaEnfermedad.AddItem (ws.Range("B132"))
    cboPresentaEnfermedad.AddItem (ws.Range("B133"))
    cboPresentaEnfermedad.AddItem (ws.Range("B134"))
    cboPresentaEnfermedad.AddItem (ws.Range("B135"))
    cboPresentaEnfermedad.AddItem (ws.Range("B136"))
    cboPresentaEnfermedad.AddItem (ws.Range("B137"))
    cboPresentaEnfermedad.AddItem (ws.Range("B138"))
    cboPresentaEnfermedad.AddItem (ws.Range("B139"))
    cboPresentaEnfermedad.AddItem (ws.Range("B140"))


    'Lista Que problemas de salud presento
    cboProblemasSalud.AddItem (ws.Range("B194"))
    cboProblemasSalud.AddItem (ws.Range("B195"))
    cboProblemasSalud.AddItem (ws.Range("B196"))
    cboProblemasSalud.AddItem (ws.Range("B197"))
    cboProblemasSalud.AddItem (ws.Range("B198"))
    cboProblemasSalud.AddItem (ws.Range("B199"))
    cboProblemasSalud.AddItem (ws.Range("B200"))
    cboProblemasSalud.AddItem (ws.Range("B201"))
    cboProblemasSalud.AddItem (ws.Range("B202"))
    cboProblemasSalud.AddItem (ws.Range("B203"))
    cboProblemasSalud.AddItem (ws.Range("B204"))
    cboProblemasSalud.AddItem (ws.Range("B205"))
    cboProblemasSalud.AddItem (ws.Range("B206"))

    'Lista Porque no recibe atencion medica
    cboNoRecibeAtencion.AddItem (ws.Range("B209"))
    cboNoRecibeAtencion.AddItem (ws.Range("B210"))
    cboNoRecibeAtencion.AddItem (ws.Range("B211"))
    cboNoRecibeAtencion.AddItem (ws.Range("B212"))

    cboCuentaIngresos.AddItem (ws.Range("K7"))
    cboCuentaIngresos.AddItem (ws.Range("K8"))
    
    cboDF.AddItem (ws.Range("K7"))
    cboDF.AddItem (ws.Range("K8"))

    cboDFM.AddItem (ws.Range("K7"))
    cboDFM.AddItem (ws.Range("K8"))

    cboCD.AddItem (ws.Range("K7"))
    cboCD.AddItem (ws.Range("K8"))

    cboCF.AddItem (ws.Range("K7"))
    cboCF.AddItem (ws.Range("K8"))

    cboVF.AddItem (ws.Range("K7"))
    cboVF.AddItem (ws.Range("K8"))

    cboMIF.AddItem (ws.Range("K7"))
    cboMIF.AddItem (ws.Range("K8"))

    cboAPM.AddItem (ws.Range("K7"))
    cboAPM.AddItem (ws.Range("K8"))

    cboFC.AddItem (ws.Range("K7"))
    cboFC.AddItem (ws.Range("K8"))
    
    'Lista Durante la Ausencia del padre
    cboAusenciaPadre.AddItem (ws.Range("B231"))
    cboAusenciaPadre.AddItem (ws.Range("B232"))
    cboAusenciaPadre.AddItem (ws.Range("B233"))
    cboAusenciaPadre.AddItem (ws.Range("B234"))
    cboAusenciaPadre.AddItem (ws.Range("B235"))
    cboAusenciaPadre.AddItem (ws.Range("B236"))
    cboAusenciaPadre.AddItem (ws.Range("B237"))
    cboAusenciaPadre.AddItem (ws.Range("B238"))
    cboAusenciaPadre.AddItem (ws.Range("B239"))
    
    'Lista Quien atiende al Adulto Mayor en casa

    cboAtiendeAdultoMayor.AddItem (ws.Range("B242"))
    cboAtiendeAdultoMayor.AddItem (ws.Range("B243"))
    cboAtiendeAdultoMayor.AddItem (ws.Range("B244"))
    cboAtiendeAdultoMayor.AddItem (ws.Range("B245"))
    cboAtiendeAdultoMayor.AddItem (ws.Range("B246"))
    cboAtiendeAdultoMayor.AddItem (ws.Range("B247"))


    
    
    
    cboMotIngPri.AddItem (ws.Range("B251"))
    cboMotIngPri.AddItem (ws.Range("B252"))
    cboMotIngPri.AddItem (ws.Range("B253"))
    cboMotIngPri.AddItem (ws.Range("B254"))
    cboMotIngPri.AddItem (ws.Range("B255"))
    cboMotIngPri.AddItem (ws.Range("B256"))
    cboMotIngPri.AddItem (ws.Range("B257"))
    cboMotIngPri.AddItem (ws.Range("B258"))
    cboMotIngPri.AddItem (ws.Range("B259"))
    cboMotIngPri.AddItem (ws.Range("B260"))
    cboMotIngPri.AddItem (ws.Range("B261"))
    cboMotIngPri.AddItem (ws.Range("B262"))
    cboMotIngPri.AddItem (ws.Range("B263"))
    cboMotIngPri.AddItem (ws.Range("B264"))
    cboMotIngPri.AddItem (ws.Range("B265"))
    cboMotIngPri.AddItem (ws.Range("B266"))
    cboMotIngPri.AddItem (ws.Range("B267"))
    cboMotIngPri.AddItem (ws.Range("B268"))

    
    cboMotIngSec.AddItem (ws.Range("B251"))
    cboMotIngSec.AddItem (ws.Range("B252"))
    cboMotIngSec.AddItem (ws.Range("B253"))
    cboMotIngSec.AddItem (ws.Range("B254"))
    cboMotIngSec.AddItem (ws.Range("B255"))
    cboMotIngSec.AddItem (ws.Range("B256"))
    cboMotIngSec.AddItem (ws.Range("B257"))
    cboMotIngSec.AddItem (ws.Range("B258"))
    cboMotIngSec.AddItem (ws.Range("B259"))
    cboMotIngSec.AddItem (ws.Range("B260"))
    cboMotIngSec.AddItem (ws.Range("B261"))
    cboMotIngSec.AddItem (ws.Range("B262"))
    cboMotIngSec.AddItem (ws.Range("B263"))
    cboMotIngSec.AddItem (ws.Range("B264"))
    cboMotIngSec.AddItem (ws.Range("B265"))
    cboMotIngSec.AddItem (ws.Range("B266"))
    cboMotIngSec.AddItem (ws.Range("B267"))
    cboMotIngSec.AddItem (ws.Range("B268"))

    
    
    
    
    'Lista Beneficiarios
    
    cboParentesco.AddItem (ws.Range("B125"))
    cboParentesco.AddItem (ws.Range("B126"))
    cboParentesco.AddItem (ws.Range("B127"))
    cboParentesco.AddItem (ws.Range("B128"))
    cboParentesco.AddItem (ws.Range("B129"))
    cboParentesco.AddItem (ws.Range("B130"))
    cboParentesco.AddItem (ws.Range("B131"))
    cboParentesco.AddItem (ws.Range("B132"))
    cboParentesco.AddItem (ws.Range("B133"))
    cboParentesco.AddItem (ws.Range("B134"))
    cboParentesco.AddItem (ws.Range("B135"))
    cboParentesco.AddItem (ws.Range("B136"))
    cboParentesco.AddItem (ws.Range("B137"))
    cboParentesco.AddItem (ws.Range("B138"))
    cboParentesco.AddItem (ws.Range("B139"))
    cboParentesco.AddItem (ws.Range("B140"))

    
    cboSexo.AddItem (ws.Range("K4"))
    cboSexo.AddItem (ws.Range("K5"))
    
    cboTieneDNI.AddItem (ws.Range("K7"))
    cboTieneDNI.AddItem (ws.Range("K8"))
    
    cboSeguro.AddItem (ws.Range("B148"))
    cboSeguro.AddItem (ws.Range("B149"))
    cboSeguro.AddItem (ws.Range("B150"))
    cboSeguro.AddItem (ws.Range("B151"))
    cboSeguro.AddItem (ws.Range("B152"))
    cboSeguro.AddItem (ws.Range("B153"))
    
    cboEstado.AddItem (ws.Range("B155"))
    cboEstado.AddItem (ws.Range("B156"))
    cboEstado.AddItem (ws.Range("B157"))
    cboEstado.AddItem (ws.Range("B158"))
    cboEstado.AddItem (ws.Range("B159"))
    cboEstado.AddItem (ws.Range("B160"))
    
    cboLeeEscribe.AddItem (ws.Range("K7"))
    cboLeeEscribe.AddItem (ws.Range("K8"))
    
    cboEstudia.AddItem (ws.Range("K7"))
    cboEstudia.AddItem (ws.Range("K8"))
    
    cboGrado.AddItem (ws.Range("B162"))
    cboGrado.AddItem (ws.Range("B163"))
    cboGrado.AddItem (ws.Range("B164"))
    cboGrado.AddItem (ws.Range("B165"))
    cboGrado.AddItem (ws.Range("B166"))
    cboGrado.AddItem (ws.Range("B167"))
    cboGrado.AddItem (ws.Range("B168"))
    cboGrado.AddItem (ws.Range("B169"))
    cboGrado.AddItem (ws.Range("B170"))
    
    cboOcupacion.AddItem (ws.Range("B172"))
    cboOcupacion.AddItem (ws.Range("B173"))
    cboOcupacion.AddItem (ws.Range("B174"))
    cboOcupacion.AddItem (ws.Range("B175"))
    cboOcupacion.AddItem (ws.Range("B176"))
    cboOcupacion.AddItem (ws.Range("B177"))
    cboOcupacion.AddItem (ws.Range("B178"))
    cboOcupacion.AddItem (ws.Range("B179"))
    cboOcupacion.AddItem (ws.Range("B180"))
    
    cboPromovido.AddItem (ws.Range("K7"))
    cboPromovido.AddItem (ws.Range("K8"))
    
    
    'cboDiscapacidad.AddItem (ws.Range("B296"))
    'cboDiscapacidad.AddItem (ws.Range("B297"))
    
    cboDiscapacidad.AddItem (ws.Range("C292"))
    cboDiscapacidad.AddItem (ws.Range("C293"))
    cboDiscapacidad.AddItem (ws.Range("C294"))
    cboDiscapacidad.AddItem (ws.Range("C295"))
    cboDiscapacidad.AddItem (ws.Range("C296"))
    cboDiscapacidad.AddItem (ws.Range("C297"))
    
    cboGestante.AddItem (ws.Range("K7"))
    cboGestante.AddItem (ws.Range("K8"))

    cboLactante.AddItem (ws.Range("K7"))
    cboLactante.AddItem (ws.Range("K8"))
    
    
    
    cboServicio.AddItem (ws.Range("J12"))
    cboServicio.AddItem (ws.Range("J13"))
    cboServicio.AddItem (ws.Range("J14"))
    cboServicio.AddItem (ws.Range("J15"))
    cboServicio.AddItem (ws.Range("J16"))
    
    
    'talleres ocupacionales
    cboArtesania.AddItem (VALUE_SI)
    cboCarpinteria.AddItem (VALUE_SI)
    cboCeramicaFrio.AddItem (VALUE_SI)
    cboComputacion.AddItem (VALUE_SI)
    cboCosmetologia.AddItem (VALUE_SI)
    cboIndVestido.AddItem (VALUE_SI)
    cboDecoracionGlobos.AddItem (VALUE_SI)
    cboJugueteria.AddItem (VALUE_SI)
    cboCorteConfeccion.AddItem (VALUE_SI)
    cboPanaderia.AddItem (VALUE_SI)
    cboIndAlimentaria.AddItem (VALUE_SI)
    cboTejidoMaquina.AddItem (VALUE_SI)
    cboTejidoLana.AddItem (VALUE_SI)
    cboTelares.AddItem (VALUE_SI)
    cboReposteria.AddItem (VALUE_SI)
    cboOtro.AddItem (VALUE_SI)
    
    
    cboEscala.AddItem ("A")
    cboEscala.AddItem ("B")
    cboEscala.AddItem ("C")
    cboEscala.AddItem ("D")
    cboEscala.AddItem ("E")
    cboEscala.AddItem ("Exon")
    
    
    Set wst = Worksheets(WORKSHEETS_BENEFICIARY)
    Taller01.Caption = wst.Range("CN2")
    Taller02.Caption = wst.Range("CO2")
    Taller03.Caption = wst.Range("CP2")
    Taller04.Caption = wst.Range("CQ2")
    Taller05.Caption = wst.Range("CR2")
    Taller06.Caption = wst.Range("CS2")
    Taller07.Caption = wst.Range("CT2")
    Taller08.Caption = wst.Range("CU2")
    Taller09.Caption = wst.Range("CV2")
    Taller10.Caption = wst.Range("CW2")
    Taller11.Caption = wst.Range("CX2")
    Taller12.Caption = wst.Range("CY2")
    Taller13.Caption = wst.Range("CZ2")
    Taller14.Caption = wst.Range("DA2")
    Taller15.Caption = wst.Range("DB2")
    Taller16.Caption = wst.Range("DC2")
    
    
    
    
    Me.btnRegistrarFamilias.Enabled = False
    Me.btnRegistrarFamilias.BackColor = &H8000000F
    Me.btnBeneficiarios.Enabled = False
    Me.btnBeneficiarios.BackColor = &H8000000F
    Me.btnEditar.Enabled = False
    Me.btnEditar.BackColor = &H8000000F

    
    
    'Campos bloqueados que se van a habilitar por la lista de decision
    
    
    cboPresentaEnfermedad.Enabled = False
    cboPresentaEnfermedad.BackColor = &H8000000F
    cboPresentaEnfermedad.Value = VALUE_EMPTY
        
    cboProblemasSalud.Enabled = False
    cboProblemasSalud.BackColor = &H8000000F
    cboProblemasSalud.Value = VALUE_EMPTY
        
    txtDiagnostico.Enabled = False
    txtDiagnostico.BackColor = &H8000000F
    txtDiagnostico.Value = VALUE_EMPTY
       
    txtEstablecimiento.Enabled = False
    txtEstablecimiento.BackColor = &H8000000F
    txtEstablecimiento.Value = VALUE_EMPTY
        
    txtTratamiento.Enabled = False
    txtTratamiento.BackColor = &H8000000F
    txtTratamiento.Value = VALUE_EMPTY
        
    cboNoRecibeAtencion.Enabled = False
    cboNoRecibeAtencion.BackColor = &H8000000F
    cboNoRecibeAtencion.Value = VALUE_EMPTY
    
    txtNroDNI.Enabled = False
    txtNroDNI.BackColor = &H8000000F
    txtNroDNI.Value = VALUE_EMPTY
    
    'talleres ocupacionales
    cboArtesania.Enabled = False
    cboArtesania.BackColor = &H8000000F
    cboArtesania.Value = VALUE_EMPTY
    
    cboCarpinteria.Enabled = False
    cboCarpinteria.BackColor = &H8000000F
    cboCarpinteria.Value = VALUE_EMPTY
    
    cboCeramicaFrio.Enabled = False
    cboCeramicaFrio.BackColor = &H8000000F
    cboCeramicaFrio.Value = VALUE_EMPTY
    
    cboComputacion.Enabled = False
    cboComputacion.BackColor = &H8000000F
    cboComputacion.Value = VALUE_EMPTY
    
    cboCosmetologia.Enabled = False
    cboCosmetologia.BackColor = &H8000000F
    cboCosmetologia.Value = VALUE_EMPTY
    
    cboIndVestido.Enabled = False
    cboIndVestido.BackColor = &H8000000F
    cboIndVestido.Value = VALUE_EMPTY
    
    cboDecoracionGlobos.Enabled = False
    cboDecoracionGlobos.BackColor = &H8000000F
    cboDecoracionGlobos.Value = VALUE_EMPTY
    
    cboJugueteria.Enabled = False
    cboJugueteria.BackColor = &H8000000F
    cboJugueteria.Value = VALUE_EMPTY
    
    cboCorteConfeccion.Enabled = False
    cboCorteConfeccion.BackColor = &H8000000F
    cboCorteConfeccion.Value = VALUE_EMPTY
    
    cboPanaderia.Enabled = False
    cboPanaderia.BackColor = &H8000000F
    cboPanaderia.Value = VALUE_EMPTY
    
    cboIndAlimentaria.Enabled = False
    cboIndAlimentaria.BackColor = &H8000000F
    cboIndAlimentaria.Value = VALUE_EMPTY
    
    cboTejidoMaquina.Enabled = False
    cboTejidoMaquina.BackColor = &H8000000F
    cboTejidoMaquina.Value = VALUE_EMPTY
    
    cboTejidoLana.Enabled = False
    cboTejidoLana.BackColor = &H8000000F
    cboTejidoLana.Value = VALUE_EMPTY
    
    cboTelares.Enabled = False
    cboTelares.BackColor = &H8000000F
    cboTelares.Value = VALUE_EMPTY
    
    cboReposteria.Enabled = False
    cboReposteria.BackColor = &H8000000F
    cboReposteria.Value = VALUE_EMPTY
    
    cboOtro.Enabled = False
    cboOtro.BackColor = &H8000000F
    cboOtro.Value = VALUE_EMPTY
    
End Sub



