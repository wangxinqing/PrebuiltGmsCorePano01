package defpackage;

import java.util.Locale;

/* renamed from: ahmd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahmd {
    public final int a;
    public final boolean b;
    public final aiaf c;

    public ahmd(aiaf aiaf, boolean z) {
        this.c = aiaf;
        this.b = z;
        int i = 100;
        if (aiaf.e() == 1056) {
            Locale locale = Locale.ENGLISH;
            new Object[1][0] = aiaf.a();
        } else {
            String[] strArr = {aiaf.a(), aiaf.b()};
            anax anax = ahme.a;
            int i2 = 0;
            while (true) {
                if (i2 < 2) {
                    if (ahme.a(strArr[i2], ahme.a, ahme.b)) {
                        Locale locale2 = Locale.ENGLISH;
                        Object[] objArr = {aiaf.a(), aiaf.b()};
                        break;
                    }
                    i2++;
                } else if (!ahme.b(aiaf)) {
                    Locale locale3 = Locale.ENGLISH;
                    Object[] objArr2 = {aiaf.a(), aiaf.b()};
                    i = 0;
                } else {
                    Locale locale4 = Locale.ENGLISH;
                    new Object[1][0] = aiaf.a();
                    i = 50;
                }
            }
        }
        this.a = i;
    }

    public final boolean a() {
        return this.a > 90;
    }

    public final boolean b() {
        return this.a >= 50;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BluetoothDeviceParams [");
        sb.append("name=");
        sb.append(this.c.a());
        sb.append(", alias=");
        sb.append(this.c.b());
        sb.append(", deviceClass=");
        sb.append(this.c.e());
        sb.append(", address=");
        sb.append(this.c.c());
        sb.append(", isVehicle=");
        String str = "n";
        sb.append(!a() ? str : "y");
        sb.append("(static=");
        sb.append(this.a);
        sb.append("), connected=");
        if (this.b) {
            str = "y";
        }
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }
}
