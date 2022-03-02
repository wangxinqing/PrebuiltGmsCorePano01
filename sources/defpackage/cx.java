package defpackage;

import com.google.android.gms.nearby.sharing.Contact;

/* renamed from: cx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cx extends vh {
    final /* synthetic */ cw a;
    final /* synthetic */ int b;
    final /* synthetic */ cw c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public cx(cw cwVar, int i, cw cwVar2, int i2, int i3) {
        this.a = cwVar;
        this.b = i;
        this.c = cwVar2;
        this.d = i2;
        this.e = i3;
    }

    public final Object a(int i, int i2) {
        Object obj = this.a.get(i + this.b);
        cw cwVar = this.c;
        Object obj2 = cwVar.get(i2 + cwVar.b);
        if (obj == null || obj2 != null) {
        }
        return null;
    }

    public final boolean b(int i, int i2) {
        Object obj = this.a.get(i + this.b);
        cw cwVar = this.c;
        Object obj2 = cwVar.get(i2 + cwVar.b);
        if (obj != obj2) {
            return (obj == null || obj2 == null || ((Contact) obj).a != ((Contact) obj2).a) ? false : true;
        }
        return true;
    }

    public final boolean c(int i, int i2) {
        Object obj = this.a.get(i + this.b);
        cw cwVar = this.c;
        Object obj2 = cwVar.get(i2 + cwVar.b);
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return ((Contact) obj).equals((Contact) obj2);
    }
}
