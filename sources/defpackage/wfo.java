package defpackage;

import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.ArrayList;

/* renamed from: wfo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wfo implements Runnable {
    private final wgu a;
    private final String b;

    public wfo(wgu wgu, String str) {
        this.a = wgu;
        this.b = str;
    }

    public final void run() {
        wgu wgu = this.a;
        String str = this.b;
        if (!wgu.i()) {
            ((anih) ((anih) vvj.a.d()).a("wgu", "b", 1038, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Ignoring expired endpoint %s because we're no longer scanning", (Object) str);
            return;
        }
        vsh vsh = wgu.h;
        ArrayList arrayList = new ArrayList(wgu.c.values());
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            wgm wgm = (wgm) arrayList.get(i);
            i++;
            if (str.equals(wgm.a)) {
                if (wgm.g) {
                    jjg jjg = vvj.a;
                    return;
                }
            }
        }
        ShareTarget d = wgu.d(str);
        if (d == null) {
            ((anih) ((anih) vvj.a.d()).a("wgu", "b", 1055, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Ignoring lost endpoint %s because we don't have an associated ShareTarget", (Object) str);
            return;
        }
        vsh.b(d);
        ((anih) ((anih) vvj.a.d()).a("wgu", "b", 1061, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Reported expired ShareTarget %s", (Object) d);
    }
}
