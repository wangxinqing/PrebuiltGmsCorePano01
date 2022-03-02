package defpackage;

import android.content.ContentValues;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.people.identity.internal.models.PersonImpl;
import com.google.android.gms.people.identity.models.Person;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: abkl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abkl implements abhe {
    public final List a = new ArrayList();
    public Person b;
    public final ablu c;
    public final abkn d;
    public int e;
    private final List f = new ArrayList();
    private List g;
    private List h;
    private int i = 0;
    private int j = 0;
    private final abko k;

    public abkl(ablu ablu, abkn abkn, abko abko) {
        this.c = ablu;
        this.d = abkn;
        this.k = abko;
    }

    public static final Set a(Person person) {
        HashSet hashSet = new HashSet();
        List list = ((PersonImpl) person).s;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Person.Memberships memberships = (Person.Memberships) list.get(i2);
                if (memberships.a()) {
                    Person.Metadata b2 = memberships.b();
                    if (b2.a() && b2.b().equals("cp2")) {
                        hashSet.add(b2.f());
                    }
                }
            }
        }
        return hashSet;
    }

    public final void a(List list, List list2, List list3) {
        this.g = list;
        this.h = list2;
    }

    public final void a() {
        ByteArrayOutputStream byteArrayOutputStream;
        abkm abkm = new abkm(this.d);
        if (!TextUtils.isEmpty(this.k.b)) {
            abkm.b.putExtra("name", this.k.b);
        }
        List list = this.h;
        if (list != null && !list.isEmpty()) {
            List list2 = this.h;
            int size = list2.size();
            for (int i2 = 0; i2 < size; i2++) {
                avhy avhy = (avhy) list2.get(i2);
                if (!avhy.b.isEmpty()) {
                    String str = avhy.b;
                    String str2 = avhy.c;
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("mimetype", "vnd.android.cursor.item/phone_v2");
                    contentValues.put("data2", 0);
                    if (!TextUtils.isEmpty(str2)) {
                        contentValues.put("data3", str2);
                    }
                    contentValues.put("data1", str);
                    abkm.a.add(contentValues);
                }
            }
        }
        List list3 = this.g;
        if (list3 != null && !list3.isEmpty()) {
            List list4 = this.g;
            int size2 = list4.size();
            for (int i3 = 0; i3 < size2; i3++) {
                avhx avhx = (avhx) list4.get(i3);
                if (!avhx.b.isEmpty()) {
                    String str3 = avhx.b;
                    String str4 = avhx.c;
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("mimetype", "vnd.android.cursor.item/email_v2");
                    contentValues2.put("data2", 0);
                    if (!TextUtils.isEmpty(str4)) {
                        contentValues2.put("data3", str4);
                    }
                    contentValues2.put("data1", str3);
                    abkm.a.add(contentValues2);
                }
            }
        }
        Person person = this.b;
        String str5 = ((PersonImpl) person).m;
        if (person.W() && str5 != null && str5.matches("[0-9]+")) {
            String format = String.format("http://www.google.com/profiles/%s", new Object[]{str5});
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("mimetype", "vnd.android.cursor.item/website");
            contentValues3.put("data1", format);
            abkm.a.add(contentValues3);
        }
        Bitmap bitmap = this.k.a;
        if (bitmap != null) {
            ContentValues contentValues4 = new ContentValues();
            contentValues4.put("mimetype", "vnd.android.cursor.item/photo");
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
                    contentValues4.put("data15", byteArrayOutputStream.toByteArray());
                    abkm.a.add(contentValues4);
                    jjt.a((Closeable) byteArrayOutputStream);
                } catch (Throwable th) {
                    th = th;
                    jjt.a((Closeable) byteArrayOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream = null;
                jjt.a((Closeable) byteArrayOutputStream);
                throw th;
            }
        }
        abkm.b.putParcelableArrayListExtra("data", abkm.a);
        abkm.c.a.startActivityForResult(abkm.b, 1);
    }

    public final void a(int i2, int i3) {
        if (this.i != i2 || this.j != i3) {
            this.i = i2;
            this.j = i3;
            List list = this.f;
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((abkk) list.get(i4)).a(i2, i3);
            }
        }
    }

    public final void a(abkj abkj) {
        this.a.add(abkj);
        if (this.e == 1) {
            abkj.a(this.b);
        }
    }

    public final void a(abkk abkk) {
        this.f.add(abkk);
        abkk.a(this.i, this.j);
    }

    public final void a(boolean z) {
        ablu ablu = this.c;
        ablu.a.restartLoader(11, (Bundle) null, new abls(ablu, a(this.b), z, new abki(this)));
    }
}
