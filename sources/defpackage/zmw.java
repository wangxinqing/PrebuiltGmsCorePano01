package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity;

/* renamed from: zmw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zmw {
    public final Bundle a;

    public zmw(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            Bundle bundle = new Bundle();
            this.a = bundle;
            bundle.putString("label", str);
            this.a.putString("url", str2);
            this.a.putString("deepLinkId", str3);
            return;
        }
        throw new IllegalArgumentException("At least one of url or deepLinkId is required.");
    }

    public static zmw a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString("label");
        String string2 = bundle.getString("url");
        String string3 = bundle.getString("deepLinkId");
        if (!TextUtils.isEmpty(string2) || !TextUtils.isEmpty(string3)) {
            return new zmw(string, string2, string3);
        }
        return null;
    }

    public final void a(zeu zeu) {
        zet zet = new zet();
        zet.a = this.a.getString("deepLinkId");
        zet.c.add(2);
        zet.b = this.a.getString("url");
        zet.c.add(3);
        ActivityEntity.ObjectEntity.AttachmentsEntity.ActionEntity.DeepLinkEntity deepLinkEntity = new ActivityEntity.ObjectEntity.AttachmentsEntity.ActionEntity.DeepLinkEntity(zet.c, zet.a, zet.b);
        zes zes = new zes();
        zes.b = this.a.getString("label");
        zes.c.add(4);
        zes.a = deepLinkEntity;
        zes.c.add(2);
        zeu.a = new ActivityEntity.ObjectEntity.AttachmentsEntity.ActionEntity(zes.c, zes.a, zes.b);
        zeu.g.add(2);
        zeu.f = "action";
        zeu.g.add(11);
    }
}
