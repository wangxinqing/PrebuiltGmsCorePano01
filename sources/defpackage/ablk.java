package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.provider.CallLog;
import com.google.android.gms.R;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.people.identity.internal.models.PersonImpl;
import com.google.android.gms.people.identity.models.Person;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: ablk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ablk extends ably {
    private String[] c;
    private abgj d;

    public ablk(Context context, Person person, abgj abgj) {
        super(context);
        if (person.S()) {
            ArrayList a = jhx.a();
            List list = ((PersonImpl) person).y;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                a.add(((Person.PhoneNumbers) list.get(i)).k());
            }
            this.c = (String[]) a.toArray(new String[a.size()]);
            this.d = abgj;
        }
    }

    /* JADX INFO: finally extract failed */
    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        int i;
        String[] strArr;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i2;
        String[] strArr2;
        String str7;
        String str8;
        List list;
        String str9 = "new";
        String str10 = "number";
        String str11 = "type";
        String str12 = "date";
        if ((!getContext().getPackageManager().hasSystemFeature("android.hardware.telephony") && !abhb.a()) || this.c == null || !this.d.b) {
            return Collections.emptyList();
        }
        if (abhd.a == null) {
            abhd.a = new abhd();
        }
        String[] strArr3 = this.c;
        Context context = getContext();
        ArrayList arrayList = new ArrayList();
        int length = strArr3.length;
        int i3 = 0;
        int i4 = 0;
        while (i4 < i) {
            String str13 = strArr[i4];
            try {
                ContentResolver contentResolver = context.getContentResolver();
                Uri build = CallLog.Calls.CONTENT_FILTER_URI.buildUpon().appendPath(str13).build();
                String[] strArr4 = new String[5];
                strArr4[i3] = str;
                strArr4[1] = str2;
                strArr4[2] = "duration";
                strArr4[3] = str3;
                strArr4[4] = str4;
                amri c2 = amri.c(contentResolver.query(build, strArr4, (String) null, (String[]) null, "date DESC LIMIT 6"));
                if (!c2.a()) {
                    list = amzy.h();
                    str8 = str4;
                    str7 = str3;
                    str6 = str2;
                    str5 = str;
                    strArr2 = strArr;
                    i2 = i;
                } else {
                    Cursor cursor = (Cursor) c2.b();
                    try {
                        if (cursor.getCount() > 0) {
                            cursor.moveToPosition(-1);
                            List arrayList2 = new ArrayList();
                            int columnIndex = cursor.getColumnIndex(str);
                            int columnIndex2 = cursor.getColumnIndex(str4);
                            int columnIndex3 = cursor.getColumnIndex(str2);
                            int columnIndex4 = cursor.getColumnIndex(str3);
                            while (cursor.moveToNext()) {
                                aucd o = avjj.j.o();
                                String str14 = str4;
                                if (o.c) {
                                    o.c();
                                    o.c = false;
                                }
                                avjj avjj = (avjj) o.b;
                                String str15 = str3;
                                avjj.b = 3;
                                avjj.a |= 1;
                                long j = cursor.getLong(columnIndex);
                                String str16 = str2;
                                String str17 = str;
                                long j2 = j / 1000;
                                String[] strArr5 = strArr;
                                if (o.c) {
                                    o.c();
                                    o.c = false;
                                }
                                avjj avjj2 = (avjj) o.b;
                                int i5 = i;
                                avjj2.a |= 512;
                                avjj2.g = j2;
                                String string = cursor.getString(columnIndex4);
                                String a = abgk.a(j, context);
                                if (o.c) {
                                    o.c();
                                    o.c = false;
                                }
                                avjj avjj3 = (avjj) o.b;
                                a.getClass();
                                avjj3.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                avjj3.f = a;
                                String valueOf = String.valueOf(string);
                                String str18 = valueOf.length() == 0 ? new String("tel:") : "tel:".concat(valueOf);
                                if (o.c) {
                                    o.c();
                                    o.c = false;
                                }
                                avjj avjj4 = (avjj) o.b;
                                str18.getClass();
                                avjj4.a |= 16;
                                avjj4.c = str18;
                                aucd o2 = avhq.d.o();
                                int i6 = cursor.getInt(columnIndex3);
                                if (i6 == 1) {
                                    avhp avhp = avhp.INCOMING;
                                    if (o2.c) {
                                        o2.c();
                                        o2.c = false;
                                    }
                                    avhq avhq = (avhq) o2.b;
                                    avhq.b = avhp.f;
                                    avhq.a |= 1;
                                    String string2 = context.getString(R.string.profile_call_type_incoming);
                                    if (o.c) {
                                        o.c();
                                        o.c = false;
                                    }
                                    avjj avjj5 = (avjj) o.b;
                                    string2.getClass();
                                    avjj5.a |= 128;
                                    avjj5.e = string2;
                                } else if (i6 == 2) {
                                    avhp avhp2 = avhp.OUTGOING;
                                    if (o2.c) {
                                        o2.c();
                                        o2.c = false;
                                    }
                                    avhq avhq2 = (avhq) o2.b;
                                    avhq2.b = avhp2.f;
                                    avhq2.a |= 1;
                                    String string3 = context.getString(R.string.profile_call_type_outgoing);
                                    if (o.c) {
                                        o.c();
                                        o.c = false;
                                    }
                                    avjj avjj6 = (avjj) o.b;
                                    string3.getClass();
                                    avjj6.a |= 128;
                                    avjj6.e = string3;
                                } else if (i6 == 3) {
                                    avhp avhp3 = avhp.MISSED;
                                    if (o2.c) {
                                        o2.c();
                                        o2.c = false;
                                    }
                                    avhq avhq3 = (avhq) o2.b;
                                    avhq3.b = avhp3.f;
                                    avhq3.a |= 1;
                                    String string4 = context.getString(R.string.profile_call_type_missed);
                                    if (o.c) {
                                        o.c();
                                        o.c = false;
                                    }
                                    avjj avjj7 = (avjj) o.b;
                                    string4.getClass();
                                    avjj7.a |= 128;
                                    avjj7.e = string4;
                                } else if (i6 != 4) {
                                    String string5 = context.getString(R.string.profile_call_type_unknown);
                                    if (o.c) {
                                        o.c();
                                        o.c = false;
                                    }
                                    avjj avjj8 = (avjj) o.b;
                                    string5.getClass();
                                    avjj8.a |= 128;
                                    avjj8.e = string5;
                                    avhp avhp4 = avhp.UNKNOWN_CALL_LOG_TYPE;
                                    if (o2.c) {
                                        o2.c();
                                        o2.c = false;
                                    }
                                    avhq avhq4 = (avhq) o2.b;
                                    avhq4.b = avhp4.f;
                                    avhq4.a |= 1;
                                } else {
                                    str4 = str14;
                                    str3 = str15;
                                    strArr = strArr5;
                                    i = i5;
                                    str2 = str16;
                                    str = str17;
                                }
                                if (o2.c) {
                                    o2.c();
                                    o2.c = false;
                                }
                                avhq avhq5 = (avhq) o2.b;
                                avhq5.c = 0;
                                avhq5.a |= 2;
                                if (!cursor.isNull(columnIndex2)) {
                                    if (cursor.getInt(columnIndex2) != 1) {
                                        if (o2.c) {
                                            o2.c();
                                            o2.c = false;
                                        }
                                        avhq avhq6 = (avhq) o2.b;
                                        avhq6.c = 2;
                                        avhq6.a |= 2;
                                    } else {
                                        if (o2.c) {
                                            o2.c();
                                            o2.c = false;
                                        }
                                        avhq avhq7 = (avhq) o2.b;
                                        avhq7.c = 1;
                                        avhq7.a |= 2;
                                    }
                                }
                                if (o.c) {
                                    o.c();
                                    o.c = false;
                                }
                                avjj avjj9 = (avjj) o.b;
                                avhq avhq8 = (avhq) o2.i();
                                avhq8.getClass();
                                avjj9.h = avhq8;
                                avjj9.a |= 2048;
                                if (o.c) {
                                    o.c();
                                    o.c = false;
                                }
                                avjj avjj10 = (avjj) o.b;
                                string.getClass();
                                avjj10.a |= 32;
                                avjj10.d = string;
                                arrayList2.add((avjj) o.i());
                                str4 = str14;
                                str3 = str15;
                                strArr = strArr5;
                                i = i5;
                                str2 = str16;
                                str = str17;
                            }
                            str8 = str4;
                            str7 = str3;
                            str6 = str2;
                            str5 = str;
                            strArr2 = strArr;
                            i2 = i;
                            cursor.close();
                            list = arrayList2;
                        } else {
                            str8 = str4;
                            str7 = str3;
                            str6 = str2;
                            str5 = str;
                            strArr2 = strArr;
                            i2 = i;
                            list = amzy.h();
                            cursor.close();
                        }
                    } catch (Throwable th) {
                        cursor.close();
                        throw th;
                    }
                }
            } catch (SQLiteException e) {
                str8 = str4;
                str7 = str3;
                str6 = str2;
                str5 = str;
                strArr2 = strArr;
                i2 = i;
                list = amzy.h();
            }
            arrayList.addAll(list);
            i4++;
            str9 = str8;
            str10 = str7;
            strArr3 = strArr2;
            length = i2;
            str11 = str6;
            str12 = str5;
            i3 = 0;
        }
        Collections.sort(arrayList, new abhc());
        ArrayList arrayList3 = new ArrayList();
        while (i3 < arrayList.size()) {
            if (i3 <= 0 || ((avjj) arrayList.get(i3)).g != ((avjj) arrayList.get(i3 - 1)).g) {
                arrayList3.add((avjj) arrayList.get(i3));
                if (arrayList3.size() >= 6) {
                    return arrayList3;
                }
            }
            i3++;
        }
        return arrayList3;
    }
}
