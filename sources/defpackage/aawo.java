package defpackage;

import android.os.Bundle;
import com.google.android.gms.security.snet.SafetyNetClientChimeraService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: aawo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aawo extends aaro {
    public aawo(SafetyNetClientChimeraService safetyNetClientChimeraService, nix nix, String str) {
        super(safetyNetClientChimeraService, nix, str);
    }

    private final void a() {
        new jfz(1, 9).execute(new aawn(this));
    }

    public final void b() {
        a(new aave((zzw) null, (String) null, this.a, (List) null, 0, (String) null, 4));
    }

    public final void c(zzw zzw) {
        a(new aave(zzw, this.a));
    }

    public final void d(zzw zzw) {
        a(new aanh(this.b, zzw));
        a();
    }

    public final void e(zzw zzw) {
        aarp aarp = this.b;
        a(new aanh(aarp, zzw, aang.a(aarp)));
        a();
    }

    public final void f(zzw zzw) {
        a(new aand(this.b, zzw));
        a();
    }

    public final void a(int i, Bundle bundle) {
        a(new aauf((zzw) null, (String) null, this.a, i, (byte[]) null, 2, bundle));
    }

    public final void b(zzw zzw) {
        a(new aave(zzw, (String) null, this.a, (List) null, 0, (String) null, 3));
    }

    public final void a(nis nis) {
        this.c.a(this.b, nis);
    }

    public final void a(zzw zzw, int i) {
        zzw zzw2 = zzw;
        a(new aave(zzw2, (String) null, this.a, Collections.singletonList(Integer.valueOf(i)), 0, (String) null, 5));
    }

    public final void a(zzw zzw, int i, String str) {
        a(new aave(zzw, str, (String) null, (List) null, i, (String) null, 6));
    }

    public final void a(zzw zzw, String str) {
        a(new aaot(zzw, str, this.a));
    }

    public final void a(zzw zzw, String str, int i, byte[] bArr) {
        a(new aauf(zzw, str, this.a, i, bArr, 1, (Bundle) null));
    }

    public final void a(zzw zzw, String str, byte[] bArr) {
        a(new aauj(this.b, zzw, str, bArr));
    }

    public final void a(zzw zzw, String str, int[] iArr, int i, String str2) {
        ArrayList arrayList = new ArrayList();
        for (int valueOf : iArr) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        a(new aave(zzw, str, this.a, arrayList, i, str2, 1));
    }
}
