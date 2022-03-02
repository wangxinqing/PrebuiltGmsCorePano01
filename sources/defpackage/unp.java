package defpackage;

import java.io.IOException;
import java.net.ServerSocket;

/* renamed from: unp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class unp extends jfx {
    final String a;
    final /* synthetic */ ServerSocket e;
    final /* synthetic */ uoh f;
    final /* synthetic */ too g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public unp(uoh uoh, int i, ServerSocket serverSocket, too too) {
        super(i);
        this.f = uoh;
        this.e = serverSocket;
        this.g = too;
        unu unu = this.f.g;
        String str = unu.a;
        int i2 = unu.e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
        sb.append(str);
        sb.append("::");
        sb.append(i2);
        this.a = sb.toString();
    }

    public final void run() {
        while (true) {
            try {
                ulu.a();
                uwf uwf = new uwf(this.e.accept());
                String str = uwf.a;
                urq urq = new urq(65);
                if (urt.SUCCESS == this.f.f.b(urq)) {
                    uwf.a(new unn(this, urq));
                    tpd tpd = this.g.a;
                    ((trw) tpd).b.a(new tlv(((trw) tpd).a.a(uwf), uwf));
                } else {
                    ((anih) ((anih) ulh.a.b()).a("unp", "run", 677, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to create a WifiHotspotSocket because we were unable to register the MediumOperation.");
                    ulu.a((ull) uwf, "WifiHotspot", str);
                    ulu.b();
                }
            } catch (IOException e2) {
                ulu.a(this.e, "WifiHotspot", this.a);
                ulu.b();
                return;
            }
        }
    }
}
