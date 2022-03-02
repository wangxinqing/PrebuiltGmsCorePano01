package defpackage;

import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState;

/* renamed from: xuk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xuk {
    public final wml a = wml.a();

    static int a(BackupAndSyncOptInState backupAndSyncOptInState) {
        int i = backupAndSyncOptInState.c;
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 1 : 4;
        }
        return 3;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i, int i2, String str) {
        wml wml = this.a;
        aucd o = xmt.h.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        xmt xmt = (xmt) o.b;
        xmt.b = i - 1;
        int i3 = xmt.a | 1;
        xmt.a = i3;
        int i4 = i2 - 1;
        if (i2 != 0) {
            xmt.d = i4;
            xmt.a = i3 | 4;
            wml.a((xmt) o.i(), str);
            return;
        }
        throw null;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i, int i2, String str, boolean z) {
        wml wml = this.a;
        aucd o = xmt.h.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        xmt xmt = (xmt) o.b;
        xmt.b = i - 1;
        int i3 = xmt.a | 1;
        xmt.a = i3;
        xmt.d = i2 - 1;
        int i4 = i3 | 4;
        xmt.a = i4;
        xmt.a = i4 | 2;
        xmt.c = z;
        wml.a((xmt) o.i(), str);
    }

    public final void a(int i, xms xms, String str) {
        wml wml = this.a;
        aucd o = xmt.h.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        xmt xmt = (xmt) o.b;
        xmt.b = 14;
        int i2 = xmt.a | 1;
        xmt.a = i2;
        xmt.d = i - 1;
        int i3 = i2 | 4;
        xmt.a = i3;
        xms.getClass();
        xmt.e = xms;
        xmt.a = i3 | 8;
        wml.a((xmt) o.i(), str);
    }
}
