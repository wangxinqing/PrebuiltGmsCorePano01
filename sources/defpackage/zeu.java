package defpackage;

import com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity;
import java.util.HashSet;
import java.util.Set;

/* renamed from: zeu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zeu {
    public ActivityEntity.ObjectEntity.AttachmentsEntity.ActionEntity a;
    public String b;
    public ActivityEntity.ObjectEntity.AttachmentsEntity.DeepLinkEntity c;
    public String d;
    public ActivityEntity.ObjectEntity.AttachmentsEntity.ImageEntity e;
    public String f;
    public final Set g = new HashSet();
    private String h;

    public final zex a() {
        return new ActivityEntity.ObjectEntity.AttachmentsEntity(this.g, this.a, this.b, this.c, this.d, this.e, this.f, this.h);
    }

    public final void a(String str) {
        this.h = str;
        this.g.add(14);
    }
}
