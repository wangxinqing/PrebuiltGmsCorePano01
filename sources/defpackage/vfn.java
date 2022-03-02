package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService;

/* renamed from: vfn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vfn extends arwm {
    final /* synthetic */ Intent a;
    final /* synthetic */ NearbyMessagesChimeraService b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vfn(NearbyMessagesChimeraService nearbyMessagesChimeraService, String str, Intent intent) {
        super(str);
        this.b = nearbyMessagesChimeraService;
        this.a = intent;
    }

    public final void run() {
        veg veg = new veg(this.b);
        Intent intent = this.a;
        NearbyMessagesChimeraService nearbyMessagesChimeraService = this.b;
        try {
            ((arwg) thl.a((Context) nearbyMessagesChimeraService, arwg.class)).b();
            Bundle extras = intent.getExtras();
            if (extras != null) {
                jjg jjg = tgc.a;
                String a2 = nsp.a((Context) nearbyMessagesChimeraService).a(intent);
                if (!extras.isEmpty() && "gcm".equals(a2)) {
                    String string = extras.getString("PUSH_MESSAGE");
                    avcm avcm = null;
                    if (string != null) {
                        avcm = (avcm) aucj.a((aucj) avcm.c, jhy.c(string));
                    }
                    if (veg.b.c()) {
                        aucd o = asnh.c.o();
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        asnh asnh = (asnh) o.b;
                        avcm.getClass();
                        asnh.b = avcm;
                        asnh.a |= 1;
                        veg.b.a((asnh) o.i());
                    }
                    if (avcm != null) {
                        if ((avcm.a & 4) == 0) {
                            ((anih) ((anih) tgc.a.c()).a("veg", "a", 92, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Ignoring empty push message");
                        } else {
                            avcn avcn = avcm.b;
                            if (avcn == null) {
                                avcn = avcn.c;
                            }
                            int size = avcn.b.size();
                            avcn.a.size();
                            if (size > 0) {
                                for (int i = 0; i < avcn.b.size(); i++) {
                                    vbp vbp = veg.a;
                                    avae avae = (avae) avcn.b.get(i);
                                    aucd aucd = (aucd) avae.c(5);
                                    aucd.a((aucj) avae);
                                    vbp.a((aucf) aucd);
                                }
                            }
                        }
                    }
                }
            }
        } catch (auda e) {
            anih anih = (anih) tgc.a.b();
            anih.a((Throwable) e);
            ((anih) anih.a("veg", "a", 104, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s", (Object) "GcmHandler: ");
        } catch (Throwable th) {
            acsb.a(nearbyMessagesChimeraService, intent);
            throw th;
        }
        acsb.a(nearbyMessagesChimeraService, intent);
    }
}
