package defpackage;

import com.google.android.gms.drive.DriveSpace;
import com.google.android.gms.drive.internal.model.File;
import java.util.Collection;
import org.json.JSONObject;

/* renamed from: lab  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lab extends lao {
    public lab(kym kym) {
        super(kym, false, (lcv) null);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return null;
    }

    public final /* bridge */ /* synthetic */ String b(Object obj, String str) {
        Collection collection = (Collection) obj;
        throw new UnsupportedOperationException("Field is not queriable");
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(kmp kmp, String str) {
        return kmp.aj();
    }

    public final /* bridge */ /* synthetic */ String a(Object obj, String str) {
        DriveSpace driveSpace = (DriveSpace) obj;
        throw new UnsupportedOperationException("Field is not queriable");
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(File file, Object obj) {
        Collection collection = (Collection) obj;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(kmp kmp, String str, Object obj, long j) {
        Collection collection = (Collection) obj;
        throw new UnsupportedOperationException("Field is read-only");
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(JSONObject jSONObject, Object obj) {
        Collection collection = (Collection) obj;
    }
}
