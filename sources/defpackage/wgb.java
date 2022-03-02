package defpackage;

import android.net.Uri;
import com.google.android.gms.nearby.sharing.Attachment;
import com.google.android.gms.nearby.sharing.FileAttachment;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TextAttachment;
import com.google.android.gms.nearby.sharing.WifiCredentialsAttachment;
import java.io.File;
import java.util.List;

/* renamed from: wgb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wgb extends wgt {
    final /* synthetic */ wcx a;
    final /* synthetic */ ShareTarget b;
    final /* synthetic */ wgu c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wgb(wgu wgu, ShareTarget shareTarget, vtx vtx, wcx wcx, ShareTarget shareTarget2) {
        super(wgu, shareTarget, vtx);
        this.c = wgu;
        this.a = wcx;
        this.b = shareTarget2;
    }

    public final boolean a() {
        Uri uri;
        this.a.a((wcw) new wfz(this, this.b));
        List list = this.b.g;
        int size = list.size();
        int i = 0;
        while (i < size) {
            FileAttachment fileAttachment = (FileAttachment) list.get(i);
            i++;
            wgu wgu = this.c;
            long b2 = wgu.b((Attachment) fileAttachment);
            if (b2 != -1) {
                tjc a2 = wgu.g.a(b2);
                if (a2 == null) {
                    ((anih) ((anih) vvj.a.c()).a("wgu", "a", 2173, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to update the location of %s. No payload found.", (Object) fileAttachment);
                } else {
                    tja tja = a2.d;
                    if (tja == null) {
                        ((anih) ((anih) vvj.a.c()).a("wgu", "a", 2179, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to update the location of %s. No file found.", (Object) fileAttachment);
                    } else {
                        File file = tja.a;
                        if (file == null) {
                            ((anih) ((anih) vvj.a.c()).a("wgu", "a", 2185, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot move attachment %s due to failure to get the Java file.", (Object) fileAttachment);
                        } else {
                            if (ayni.a.a().f()) {
                                if (jkr.i()) {
                                    uri = wgu.a(file, fileAttachment);
                                } else {
                                    uri = null;
                                }
                                if (uri == null) {
                                    uri = wgu.a(file, wgu.b(fileAttachment), fileAttachment);
                                }
                            } else if (jkr.i()) {
                                uri = wgu.a(file, fileAttachment);
                            } else {
                                uri = wgu.a(file, wgu.b(fileAttachment), fileAttachment);
                            }
                            if (uri != null) {
                                wgg wgg = (wgg) wgu.b.get(fileAttachment);
                                if (wgg == null) {
                                    wgg = new wgg();
                                    wgu.b.put(fileAttachment, wgg);
                                }
                                wgg.a = uri;
                            }
                        }
                    }
                }
            } else {
                ((anih) ((anih) vvj.a.c()).a("wgu", "a", 2166, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to update the location of %s. No payload ID found.", (Object) fileAttachment);
            }
            return false;
        }
        wgu.l();
        List list2 = this.b.f;
        int size2 = list2.size();
        int i2 = 0;
        while (i2 < size2) {
            TextAttachment textAttachment = (TextAttachment) list2.get(i2);
            i2++;
            wgu wgu2 = this.c;
            long b3 = wgu2.b((Attachment) textAttachment);
            if (b3 != -1) {
                tjc a3 = wgu2.g.a(b3);
                if (a3 != null) {
                    byte[] bArr = a3.c;
                    if (!whu.a(bArr)) {
                        String str = new String(bArr);
                        wgg wgg2 = (wgg) wgu2.b.get(textAttachment);
                        if (wgg2 == null) {
                            wgg2 = new wgg();
                            wgu2.b.put(textAttachment, wgg2);
                        }
                        wgg2.d = str;
                    } else {
                        ((anih) ((anih) vvj.a.c()).a("wgu", "a", 2147, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to receive text body of %s. Incoming bytes is empty.", (Object) textAttachment);
                    }
                } else {
                    ((anih) ((anih) vvj.a.c()).a("wgu", "a", 2141, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to receive text body of %s. No payload found.", (Object) textAttachment);
                }
            } else {
                ((anih) ((anih) vvj.a.c()).a("wgu", "a", 2135, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to receive text body of %s. No payload ID found.", (Object) textAttachment);
            }
            return false;
        }
        List list3 = this.b.h;
        int size3 = list3.size();
        int i3 = 0;
        while (i3 < size3) {
            WifiCredentialsAttachment wifiCredentialsAttachment = (WifiCredentialsAttachment) list3.get(i3);
            i3++;
            wgu wgu3 = this.c;
            long b4 = wgu3.b((Attachment) wifiCredentialsAttachment);
            if (b4 != -1) {
                tjc a4 = wgu3.g.a(b4);
                if (a4 != null) {
                    byte[] bArr2 = a4.c;
                    if (!whu.a(bArr2)) {
                        try {
                            vnx vnx = (vnx) aucj.a((aucj) vnx.d, bArr2, aubs.c());
                            wgg wgg3 = (wgg) wgu3.b.get(wifiCredentialsAttachment);
                            if (wgg3 == null) {
                                wgg3 = new wgg();
                                wgu3.b.put(wifiCredentialsAttachment, wgg3);
                            }
                            wgg3.b = vnx;
                        } catch (auda e) {
                            anih anih = (anih) vvj.a.c();
                            anih.a((Throwable) e);
                            ((anih) anih.a("wgu", "a", 2127, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to receive Wi-Fi credential of %s.", (Object) wifiCredentialsAttachment);
                        }
                    } else {
                        ((anih) ((anih) vvj.a.c()).a("wgu", "a", 2116, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to receive Wi-Fi credential of %s. No file found.", (Object) wifiCredentialsAttachment);
                    }
                } else {
                    ((anih) ((anih) vvj.a.c()).a("wgu", "a", 2109, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to receive Wi-Fi credential of %s. No payload found.", (Object) wifiCredentialsAttachment);
                }
            } else {
                ((anih) ((anih) vvj.a.c()).a("wgu", "a", 2102, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to receive Wi-Fi credential %s. No payload ID found.", (Object) wifiCredentialsAttachment);
            }
            return false;
        }
        return true;
    }

    public final void b() {
        tja tja;
        File file;
        List b2 = this.b.b();
        int size = b2.size();
        for (int i = 0; i < size; i++) {
            Attachment attachment = (Attachment) b2.get(i);
            wgu wgu = this.c;
            long b3 = wgu.b(attachment);
            if (b3 == -1) {
                ((anih) ((anih) vvj.a.c()).a("wgu", "a", 2391, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to retrieve payload for: %s", (Object) attachment);
            } else {
                tjc a2 = wgu.g.a(b3);
                if (!(a2 == null || (tja = a2.d) == null || (file = tja.a) == null)) {
                    file.delete();
                }
            }
        }
        wgu.l();
    }
}
