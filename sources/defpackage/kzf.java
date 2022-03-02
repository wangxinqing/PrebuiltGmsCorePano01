package defpackage;

import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.model.File;
import org.json.JSONObject;

/* renamed from: kzf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kzf extends lbc {
    public kzf(kyq kyq) {
        super(kyq, false, (lcv) null);
    }

    public final /* bridge */ /* synthetic */ String b(Object obj) {
        DriveId driveId = (DriveId) obj;
        if (driveId != null && driveId.a == null) {
            return kmk.a.a.a();
        }
        return kmj.RESOURCE_ID.c.a();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(kmp kmp, String str) {
        return kmp.g();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return DriveId.b(jSONObject.getString(this.b.a()));
    }

    public final /* bridge */ /* synthetic */ String b(Object obj, String str) {
        String str2 = ((DriveId) obj).a;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 2);
        sb.append("'");
        sb.append(str2);
        sb.append("'");
        return sb.toString();
    }

    public final /* bridge */ /* synthetic */ String a(Object obj) {
        DriveId driveId = (DriveId) obj;
        String str = driveId.a;
        return str == null ? Long.toString(driveId.b) : str;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(File file, Object obj) {
        DriveId driveId = (DriveId) obj;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(kmp kmp, String str, Object obj, long j) {
        DriveId driveId = (DriveId) obj;
        throw new UnsupportedOperationException("Cannot set DRIVE_ID.");
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(JSONObject jSONObject, Object obj) {
        jSONObject.put(this.b.a(), ((DriveId) obj).a());
    }
}
