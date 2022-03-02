package defpackage;

import java.util.List;

/* renamed from: ubu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ubu extends arwm {
    final /* synthetic */ List a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ubu(String str, List list) {
        super(str);
        this.a = list;
    }

    public final void run() {
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((ttg) list.get(i)).a(true);
        }
    }
}
