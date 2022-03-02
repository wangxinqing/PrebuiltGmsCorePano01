package defpackage;

import java.util.ArrayList;

/* renamed from: aiad  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiad {
    final /* synthetic */ aiaq a;
    final /* synthetic */ ArrayList b;
    final /* synthetic */ airo c;

    public aiad() {
    }

    public final void a(aibw aibw, aiam aiam, aibe aibe, boolean z) {
        String str;
        Object obj;
        if (aibw != null) {
            int b2 = aibw.b();
            StringBuilder sb = new StringBuilder(30);
            sb.append("present with count ");
            sb.append(b2);
            str = sb.toString();
        } else {
            str = " NULL ";
        }
        String valueOf = String.valueOf(str);
        if (valueOf.length() == 0) {
            new String("Computing location, wifiScan is ");
        } else {
            "Computing location, wifiScan is ".concat(valueOf);
        }
        String valueOf2 = String.valueOf(aiam);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 34);
        sb2.append("Computing location, cellStatus is ");
        sb2.append(valueOf2);
        sb2.toString();
        aiax a2 = this.c.a(aibw, aiam, this.a, aibe, z);
        String valueOf3 = String.valueOf(a2.a);
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 23);
        sb3.append("Location bestResult is ");
        sb3.append(valueOf3);
        sb3.toString();
        aibo aibo = a2.b;
        Object obj2 = "null";
        if (aibo != null) {
            obj = aibo.d;
        } else {
            obj = obj2;
        }
        String valueOf4 = String.valueOf(obj);
        StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 13);
        sb4.append("wifi status: ");
        sb4.append(valueOf4);
        sb4.toString();
        aiah aiah = a2.c;
        if (aiah != null) {
            obj2 = aiah.d;
        }
        String valueOf5 = String.valueOf(obj2);
        StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf5).length() + 13);
        sb5.append("cell status: ");
        sb5.append(valueOf5);
        sb5.toString();
        this.b.add(a2);
    }

    public aiad(airo airo, aiaq aiaq, ArrayList arrayList) {
        this.c = airo;
        this.a = aiaq;
        this.b = arrayList;
    }
}
