package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.udc.UdcWriteLocalSettingsRequest;
import java.util.ArrayList;

/* renamed from: adal  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adal extends aczm {
    private static final jjg a = jjg.a();
    private final UdcWriteLocalSettingsRequest b;
    private final adao k = new adao(this.c, this.g);
    private final amsv l;

    public adal(Context context, adbx adbx, ClientContext clientContext, String str, amsv amsv, UdcWriteLocalSettingsRequest udcWriteLocalSettingsRequest) {
        super(context, adbx, clientContext, str, "WriteLocalSettingsOperation");
        this.b = udcWriteLocalSettingsRequest;
        this.l = amsv;
    }

    private final Status a() {
        int i;
        if (!jhg.b()) {
            if (!jhx.a((Object[]) azrk.a.a().U().split(","), (Object) this.e.e)) {
                ((anih) ((anih) a.c()).a("adal", "a", 70, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("writeLocalSettings called by non-whitelisted package: %s", (Object) this.e.e);
                return Status.c;
            }
        }
        if (!azrk.f()) {
            ArrayList arrayList = new ArrayList();
            for (UdcWriteLocalSettingsRequest.SettingChange settingChange : this.b.a) {
                aucd o = atzg.d.o();
                int i2 = settingChange.a;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                atzg atzg = (atzg) o.b;
                int i3 = atzg.a | 1;
                atzg.a = i3;
                atzg.b = i2;
                if (!settingChange.b) {
                    i = 4;
                } else {
                    i = 3;
                }
                atzg.c = i - 1;
                atzg.a = i3 | 2;
                arrayList.add((atzg) o.i());
            }
            this.k.a((atzg[]) arrayList.toArray(new atzg[0]));
            if (azrk.a.a().l()) {
                ClientContext clientContext = this.e;
                ((anih) ((anih) a.d()).a("adal", "a", 93, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("writeLocalSettings() sending FACS_CACHE_UPDATED[_EXPLICIT] broadcasts for user %s. Package: %s", (Object) clientContext.c, (Object) clientContext.e);
                new adef(this.c).a(this.e.c);
            }
        } else {
            aucd o2 = atvp.d.o();
            for (UdcWriteLocalSettingsRequest.SettingChange settingChange2 : this.b.a) {
                int i4 = settingChange2.a;
                if (i4 == 9) {
                    boolean z = settingChange2.b;
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    atvp atvp = (atvp) o2.b;
                    atvp.a |= 2;
                    atvp.c = z;
                } else if (i4 == 10) {
                    boolean z2 = settingChange2.b;
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    atvp atvp2 = (atvp) o2.b;
                    atvp2.a |= 1;
                    atvp2.b = z2;
                }
            }
            int i5 = ((atvp) o2.b).a;
            if (!((i5 & 2) == 0 && (i5 & 1) == 0)) {
                agqt agqt = (agqt) this.l.a();
                aucd o3 = atxi.f.o();
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                atxi atxi = (atxi) o3.b;
                atvp atvp3 = (atvp) o2.i();
                atvp3.getClass();
                atxi.d = atvp3;
                atxi.a |= 8;
                adhn.a(agqt.a((atxi) o3.i()));
            }
        }
        return Status.a;
    }

    public final void a(Context context) {
        Status status;
        int i;
        super.a(context);
        b();
        if (!jhg.b()) {
            if (!jhx.a((Object[]) azrk.a.a().U().split(","), (Object) this.e.e)) {
                ((anih) ((anih) a.c()).a("adal", "a", 70, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("writeLocalSettings called by non-whitelisted package: %s", (Object) this.e.e);
                status = Status.c;
                a(status.i);
                this.d.a(status);
            }
        }
        if (!azrk.f()) {
            ArrayList arrayList = new ArrayList();
            for (UdcWriteLocalSettingsRequest.SettingChange settingChange : this.b.a) {
                aucd o = atzg.d.o();
                int i2 = settingChange.a;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                atzg atzg = (atzg) o.b;
                int i3 = atzg.a | 1;
                atzg.a = i3;
                atzg.b = i2;
                if (!settingChange.b) {
                    i = 4;
                } else {
                    i = 3;
                }
                atzg.c = i - 1;
                atzg.a = i3 | 2;
                arrayList.add((atzg) o.i());
            }
            this.k.a((atzg[]) arrayList.toArray(new atzg[0]));
            if (azrk.a.a().l()) {
                ClientContext clientContext = this.e;
                ((anih) ((anih) a.d()).a("adal", "a", 93, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("writeLocalSettings() sending FACS_CACHE_UPDATED[_EXPLICIT] broadcasts for user %s. Package: %s", (Object) clientContext.c, (Object) clientContext.e);
                new adef(this.c).a(this.e.c);
            }
        } else {
            aucd o2 = atvp.d.o();
            for (UdcWriteLocalSettingsRequest.SettingChange settingChange2 : this.b.a) {
                int i4 = settingChange2.a;
                if (i4 == 9) {
                    boolean z = settingChange2.b;
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    atvp atvp = (atvp) o2.b;
                    atvp.a |= 2;
                    atvp.c = z;
                } else if (i4 == 10) {
                    boolean z2 = settingChange2.b;
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    atvp atvp2 = (atvp) o2.b;
                    atvp2.a |= 1;
                    atvp2.b = z2;
                }
            }
            int i5 = ((atvp) o2.b).a;
            if (!((i5 & 2) == 0 && (i5 & 1) == 0)) {
                agqt agqt = (agqt) this.l.a();
                aucd o3 = atxi.f.o();
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                atxi atxi = (atxi) o3.b;
                atvp atvp3 = (atvp) o2.i();
                atvp3.getClass();
                atxi.d = atvp3;
                atxi.a |= 8;
                adhn.a(agqt.a((atxi) o3.i()));
            }
        }
        status = Status.a;
        a(status.i);
        this.d.a(status);
    }

    public final void a(Status status) {
        a(status.i);
        this.d.a(status);
    }
}
