package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.provider.Telephony;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.R;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.people.identity.internal.models.PersonImpl;
import com.google.android.gms.people.identity.models.Person;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: abml  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abml extends ably {
    private static final Uri c = Uri.parse("content://mms-sms/threadID");
    private String[] d;
    private abgj e;

    public abml(Context context, Person person, abgj abgj) {
        super(context);
        if (person.S()) {
            ArrayList a = jhx.a();
            List list = ((PersonImpl) person).y;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                a.add(((Person.PhoneNumbers) list.get(i)).k());
            }
            this.d = (String[]) a.toArray(new String[a.size()]);
            this.e = abgj;
        }
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        String[] strArr;
        int i;
        int i2;
        Cursor cursor;
        if ((!getContext().getPackageManager().hasSystemFeature("android.hardware.telephony") && !abhb.a()) || (strArr = this.d) == null || strArr.length == 0 || !this.e.a) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr2 = this.d;
        int length = strArr2.length;
        int i3 = 0;
        while (true) {
            i = 1;
            if (i3 >= length) {
                break;
            }
            String str = strArr2[i3];
            Context context = getContext();
            Uri.Builder buildUpon = c.buildUpon();
            buildUpon.appendQueryParameter("recipient", str);
            try {
                cursor = context.getContentResolver().query(buildUpon.build(), new String[]{"_id"}, (String) null, (String[]) null, (String) null);
            } catch (SQLiteException e2) {
                cursor = null;
            }
            String str2 = "";
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        str2 = cursor.getString(0);
                    }
                } finally {
                    cursor.close();
                }
            }
            arrayList.add(str2);
            i3++;
        }
        int i4 = Build.VERSION.SDK_INT;
        int i5 = 2;
        String str3 = "address";
        String[] strArr3 = {"body", "date", str3, "read", "type"};
        String valueOf = String.valueOf(abgk.a(arrayList.size()));
        String str4 = valueOf.length() == 0 ? new String("thread_id IN ") : "thread_id IN ".concat(valueOf);
        ContentResolver contentResolver = getContext().getContentResolver();
        Uri uri = Telephony.Sms.CONTENT_URI;
        String str5 = "type";
        String[] strArr4 = (String[]) arrayList.toArray(new String[arrayList.size()]);
        int i6 = 4;
        Cursor query = contentResolver.query(uri, strArr3, str4, strArr4, "date DESC LIMIT 1");
        Context context2 = getContext();
        int i7 = Build.VERSION.SDK_INT;
        if (query == null) {
            return Collections.emptyList();
        }
        try {
            ArrayList arrayList2 = new ArrayList();
            while (query.moveToNext()) {
                aucd o = avjj.j.o();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                avjj avjj = (avjj) o.b;
                avjj.b = i6;
                avjj.a |= i;
                int i8 = query.getInt(query.getColumnIndex(str5));
                String string = query.getString(query.getColumnIndex("body"));
                if (i8 == i5) {
                    Resources resources = context2.getResources();
                    Object[] objArr = new Object[i];
                    objArr[0] = string;
                    string = resources.getString(R.string.profile_sms_message_from_you_prefix, objArr);
                }
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                avjj avjj2 = (avjj) o.b;
                string.getClass();
                avjj2.a |= 32;
                avjj2.d = string;
                String string2 = query.getString(query.getColumnIndex(str3));
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                avjj avjj3 = (avjj) o.b;
                string2.getClass();
                avjj3.a |= 128;
                avjj3.e = string2;
                long j = query.getLong(query.getColumnIndex("date"));
                String str6 = str3;
                long j2 = j / 1000;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                avjj avjj4 = (avjj) o.b;
                avjj4.a |= 512;
                avjj4.g = j2;
                String a = abgk.a(j, context2);
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                avjj avjj5 = (avjj) o.b;
                a.getClass();
                avjj5.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                avjj5.f = a;
                if (!query.isNull(query.getColumnIndex("read"))) {
                    i2 = query.getInt(query.getColumnIndex("read")) != 1 ? 3 : 2;
                } else {
                    i2 = 1;
                }
                aucd o2 = avig.c.o();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                avig avig = (avig) o2.b;
                avig.b = i2 - 1;
                avig.a |= 1;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                avjj avjj6 = (avjj) o.b;
                avig avig2 = (avig) o2.i();
                avig2.getClass();
                avjj6.i = avig2;
                avjj6.a |= FragmentTransaction.TRANSIT_ENTER_MASK;
                String str7 = str6;
                String valueOf2 = String.valueOf(query.getString(query.getColumnIndex(str7)));
                String str8 = valueOf2.length() == 0 ? new String("smsto:") : "smsto:".concat(valueOf2);
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                avjj avjj7 = (avjj) o.b;
                str8.getClass();
                avjj7.a |= 16;
                avjj7.c = str8;
                arrayList2.add((avjj) o.i());
                str3 = str7;
                i = 1;
                i6 = 4;
                i5 = 2;
            }
            return arrayList2;
        } finally {
            query.close();
        }
    }
}
