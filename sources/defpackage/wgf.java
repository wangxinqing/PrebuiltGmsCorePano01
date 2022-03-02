package defpackage;

import com.google.android.gms.nearby.sharing.provider.connections.NearbySharingProvider$4;
import java.util.Collection;

/* renamed from: wgf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class wgf implements Runnable {
    private final NearbySharingProvider$4 a;

    public wgf(NearbySharingProvider$4 nearbySharingProvider$4) {
        this.a = nearbySharingProvider$4;
    }

    public final void run() {
        NearbySharingProvider$4 nearbySharingProvider$4 = this.a;
        anhk i = amzy.a((Collection) nearbySharingProvider$4.a.a.keySet()).listIterator();
        while (i.hasNext()) {
            String str = (String) i.next();
            byte[] bArr = (byte[]) nearbySharingProvider$4.a.a.remove(str);
            if (bArr != null) {
                nearbySharingProvider$4.a.a(str, bArr);
            }
        }
    }
}
