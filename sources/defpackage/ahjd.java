package defpackage;

/* renamed from: ahjd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahjd implements aiao {
    final /* synthetic */ ajaj a;

    public ahjd(ajaj ajaj) {
        this.a = ajaj;
    }

    public final void a(boolean z, int i, aiaf aiaf) {
        boolean z2;
        if (i == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        StringBuilder sb = new StringBuilder(85);
        sb.append("chre onVehicleBluetoothStateChanged connected = ");
        sb.append(z);
        sb.append(", vehicle classification = ");
        sb.append(z2);
        sb.toString();
        if (i == 1) {
            this.a.a(Boolean.valueOf(z), (Boolean) null);
        }
    }
}
