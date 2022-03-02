package defpackage;

import android.content.ContentValues;
import android.os.Bundle;
import com.android.volley.VolleyError;
import com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ysd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ysd {
    public static final iyu j;
    public final zdf a;
    public final zdg b;
    public final zdh c;
    public final zdk d;
    public final zdl e;
    public final zdm f;
    public final zdn g;
    public final zdo h;
    public final izb i;

    static {
        iyu iyu = new iyu();
        iyu.a("id");
        iyu.a("displayName");
        j = iyu;
    }

    public ysd(izb izb) {
        this.i = izb;
        izb.g = 6400;
        this.a = new zdf(izb);
        this.b = new zdg(izb);
        this.d = new zdk(izb);
        this.g = new zdn(izb);
        this.c = new zdh(izb);
        this.e = new zdl(izb);
        this.f = new zdm(izb);
        this.h = new zdo(izb);
    }

    public static ContentValues a(String str) {
        ContentValues contentValues = new ContentValues(ysw.a.length);
        for (String putNull : ysw.a) {
            contentValues.putNull(putNull);
        }
        contentValues.put("url", str);
        return contentValues;
    }

    public static zfa a(String str, Bundle bundle) {
        zeu zeu = new zeu();
        zeu.a(str);
        if (bundle != null && !bundle.isEmpty()) {
            zmw.a(bundle).a(zeu);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(zeu.a());
        zey zey = new zey();
        zey.a(arrayList);
        zez a2 = zey.a();
        zer zer = new zer();
        zer.a(a2);
        return zer.a();
    }

    public static void a(ContentValues contentValues, zfa zfa) {
        ActivityEntity.ObjectEntity objectEntity = ((ActivityEntity) zfa).f;
        if (objectEntity != null) {
            List list = objectEntity.d;
            if (list == null || list.isEmpty()) {
                throw new VolleyError("Link preview requires object.attachments[].");
            }
            ActivityEntity.ObjectEntity.AttachmentsEntity attachmentsEntity = (ActivityEntity.ObjectEntity.AttachmentsEntity) list.get(0);
            if (attachmentsEntity != null) {
                contentValues.put("title", attachmentsEntity.f);
                contentValues.put("type", attachmentsEntity.h);
                contentValues.put("description", attachmentsEntity.d);
                if (attachmentsEntity.a.contains(2)) {
                    contentValues.put("callToActionDisplayName", attachmentsEntity.c.d);
                }
                ActivityEntity.ObjectEntity.AttachmentsEntity.ImageEntity imageEntity = attachmentsEntity.g;
                if (imageEntity != null) {
                    contentValues.put("thumbnailUrl", imageEntity.c);
                    return;
                }
                return;
            }
            throw new VolleyError("Link preview requires attachments.");
        }
        throw new VolleyError("Link preview requires object.");
    }

    public static void a(String str, ContentValues contentValues) {
        yrv a2 = yrv.a();
        synchronized (a2.b) {
            a2.b.a((Object) str, (Object) contentValues);
        }
    }
}
