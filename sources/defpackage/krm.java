package defpackage;

import com.google.android.gms.drive.events.ChangesAvailableOptions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: krm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class krm implements ktj {
    public final ksn a;
    public final kpk b;
    public final ChangesAvailableOptions c;
    public final String d;
    public final Set e;
    private final long f;
    private boolean g = false;

    public krm(kpk kpk, ksj ksj) {
        Collection collection;
        this.b = kpk;
        JSONObject jSONObject = new JSONObject(kpk.e);
        int i = jSONObject.getInt("optionsSizeLimit");
        boolean z = jSONObject.getBoolean("optionsRepeats");
        if (jSONObject.has("optionsSpaces")) {
            collection = kti.a(jSONObject.getJSONArray("optionsSpaces"));
        } else {
            collection = anfv.a;
        }
        this.c = new ChangesAvailableOptions(i, z, new ArrayList(collection));
        this.d = kti.a(jSONObject);
        this.e = kti.b(jSONObject);
        long j = jSONObject.getLong("sequenceNumber");
        this.f = j;
        this.a = new ksn(ksj, j, this.c, this.e);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a() {
        alys.b(!this.g, "Already initialized");
        this.g = true;
    }

    public final kpk b() {
        return this.b;
    }

    public final boolean c() {
        return this.a.b();
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(khq khq, kkf kkf) {
        a();
        klb b2 = kkf.b(khq.a.a);
        long j = this.f;
        if (j >= b2.b) {
            kjp kjp = (kjp) kkf;
            this.a.a(kjp.a("ScopedEntryView", true, kqz.a(lrr.b(khq.a.b), lrr.a(khq), lrr.a(this.e), kne.SEQUENCE_NUMBER.aB.c(j))));
            return;
        }
        this.a.a();
    }
}
