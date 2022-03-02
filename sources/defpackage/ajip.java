package defpackage;

import java.util.ArrayList;
import java.util.Locale;

/* renamed from: ajip  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajip {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();

    public final void a(byte[] bArr, ajjr ajjr) {
        this.f.add(bArr);
        if ((ajjr.a & 1) != 0) {
            ArrayList arrayList = this.a;
            ajjx ajjx = ajjr.b;
            if (ajjx == null) {
                ajjx = ajjx.u;
            }
            arrayList.add(ajjx);
        }
        if ((ajjr.a & 2) != 0) {
            ajcd ajcd = ajjr.c;
            if (ajcd == null) {
                ajcd = ajcd.f;
            }
            this.b.add(aisr.a(ajcd));
        }
        if ((ajjr.a & 4) != 0) {
            atco atco = ajjr.d;
            if (atco == null) {
                atco = atco.r;
            }
            String valueOf = String.valueOf(atco);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
            sb.append("addMetadataGrpc: ");
            sb.append(valueOf);
            sb.toString();
            atco.i.size();
            this.c.add(atco);
        }
        if ((ajjr.a & 8) != 0) {
            atde atde = ajjr.e;
            if (atde == null) {
                atde = atde.b;
            }
            this.d.add(atde);
        }
        if ((ajjr.a & 16) != 0) {
            atdp atdp = ajjr.f;
            if (atdp == null) {
                atdp = atdp.f;
            }
            this.e.add(atdp);
        }
    }

    public final String toString() {
        return String.format(Locale.ENGLISH, "%d locations, %d activities, and %d metadata", new Object[]{Integer.valueOf(this.a.size()), Integer.valueOf(this.b.size()), Integer.valueOf(this.c.size())});
    }
}
