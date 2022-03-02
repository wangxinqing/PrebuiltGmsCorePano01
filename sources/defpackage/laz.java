package defpackage;

import com.google.android.gms.drive.internal.model.File;
import org.json.JSONObject;

/* renamed from: laz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class laz extends lbc {
    public laz(kyq kyq) {
        super(kyq, false, (lcv) null);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(kmp kmp, String str) {
        int i;
        if (kmp.a.ai != null) {
            i = 1;
        } else {
            i = 0;
        }
        return Integer.valueOf(i);
    }

    public final /* bridge */ /* synthetic */ String b(Object obj, String str) {
        return Integer.toString(((Integer) obj).intValue());
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.getInt(this.b.a()));
    }

    public final /* bridge */ /* synthetic */ String a(Object obj) {
        return Integer.toString(((Integer) obj).intValue());
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(File file, Object obj) {
        Integer num = (Integer) obj;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(kmp kmp, String str, Object obj, long j) {
        Integer num = (Integer) obj;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(JSONObject jSONObject, Object obj) {
        jSONObject.put(this.b.a(), (Integer) obj);
    }
}
