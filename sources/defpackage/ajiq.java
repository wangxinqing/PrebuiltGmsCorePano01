package defpackage;

import com.google.android.ulr.ApiMetadata;
import com.google.android.ulr.ApiSensorData;
import com.google.android.ulr.ApiUserData;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: ajiq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajiq {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    private final jas g = new jas();
    private final jas h = new jas();
    private final jas i = new jas();

    public final void a(byte[] bArr, ajjs ajjs) {
        ApiSensorData apiSensorData;
        ApiMetadata apiMetadata;
        this.f.add(bArr);
        if ((ajjs.a & 1) != 0) {
            ArrayList arrayList = this.a;
            ajjx ajjx = ajjs.b;
            if (ajjx == null) {
                ajjx = ajjx.u;
            }
            arrayList.add(ajjx);
        }
        if ((ajjs.a & 2) != 0) {
            ajcd ajcd = ajjs.c;
            if (ajcd == null) {
                ajcd = ajcd.f;
            }
            this.b.add(aisr.a(ajcd));
        }
        ApiUserData apiUserData = null;
        if ((ajjs.a & 4) != 0) {
            String str = ajjs.d;
            if (str != null) {
                try {
                    apiMetadata = new ApiMetadata();
                    this.g.a(str, (jag) apiMetadata);
                } catch (jaq e2) {
                    ajix.a("GCoreUlr", 41, "Error deserializing metadata", e2);
                    apiMetadata = null;
                }
            } else {
                apiMetadata = null;
            }
            if (apiMetadata != null) {
                this.c.add(apiMetadata);
            }
        }
        if ((ajjs.a & 8) != 0) {
            String str2 = ajjs.e;
            if (str2 != null) {
                try {
                    apiSensorData = new ApiSensorData();
                    this.h.a(str2, (jag) apiSensorData);
                } catch (jaq e3) {
                    ajix.a("GCoreUlr", 41, "Error deserializing sensor data", e3);
                    apiSensorData = null;
                }
            } else {
                apiSensorData = null;
            }
            if (apiSensorData != null) {
                this.d.add(apiSensorData);
            }
        }
        if ((ajjs.a & 16) != 0) {
            String str3 = ajjs.f;
            if (str3 != null) {
                try {
                    ApiUserData apiUserData2 = new ApiUserData();
                    this.i.a(str3, (jag) apiUserData2);
                    apiUserData = apiUserData2;
                } catch (jaq e4) {
                    ajix.a("GCoreUlr", 41, "Error deserializing user data", e4);
                }
            }
            if (apiUserData != null) {
                this.e.add(apiUserData);
            }
        }
    }

    public final String toString() {
        return String.format(Locale.ENGLISH, "%d locations, %d activities, and %d metadata", new Object[]{Integer.valueOf(this.a.size()), Integer.valueOf(this.b.size()), Integer.valueOf(this.c.size())});
    }
}
