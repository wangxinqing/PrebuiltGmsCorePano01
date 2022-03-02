package defpackage;

import com.google.android.gms.notifications.ReadStateUpdate;

/* renamed from: wkd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wkd extends wjz implements niz {
    private final nix a;

    public wkd(nix nix) {
        this.a = nix;
    }

    public final void a(wjy wjy, String str, String str2, ReadStateUpdate readStateUpdate) {
        this.a.a(new wke(str, str2, readStateUpdate, new wkc(wjy)));
    }
}
