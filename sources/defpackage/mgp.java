package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.people.model.AvatarReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;

/* renamed from: mgp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mgp {
    private static final String[] a = {"_id", "display_name", "times_contacted"};
    private static final String b;
    private static final String[] c = {"contact_id", "data1"};
    private static final String[] d = {"contact_id", "data1"};

    static {
        long f = axgd.a.a().f();
        StringBuilder sb = new StringBuilder(40);
        sb.append("times_contacted > '");
        sb.append(f);
        sb.append("'");
        b = sb.toString();
    }

    public static List a(Context context, boolean z) {
        ContentResolver contentResolver = context.getContentResolver();
        Cursor query = contentResolver.query(ContactsContract.Contacts.CONTENT_URI, a, b, (String[]) null, (String) null);
        PriorityQueue priorityQueue = new PriorityQueue(10);
        query.move(-1);
        char c2 = 0;
        int i = 0;
        while (query.moveToNext()) {
            i++;
            long j = query.getLong(query.getColumnIndex("_id"));
            String string = query.getString(query.getColumnIndex("display_name"));
            int i2 = query.getInt(query.getColumnIndex("times_contacted"));
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new mgo(j, string, i2));
            } else if (((mgo) priorityQueue.peek()).c < i2) {
                priorityQueue.poll();
                priorityQueue.add(new mgo(j, string, i2));
            }
        }
        StringBuilder sb = new StringBuilder(47);
        sb.append("total number of contacts processed: ");
        sb.append(i);
        sb.toString();
        ith ith = mfv.a;
        query.close();
        ArrayList arrayList = new ArrayList();
        while (!priorityQueue.isEmpty()) {
            arrayList.add((mgo) priorityQueue.poll());
        }
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            mgo mgo = (mgo) arrayList.get(i3);
            String[] strArr = new String[1];
            strArr[c2] = Long.toString(mgo.a);
            ArrayList arrayList3 = new ArrayList();
            Cursor query2 = contentResolver.query(ContactsContract.CommonDataKinds.Email.CONTENT_URI, d, "contact_id = ?", strArr, (String) null);
            while (query2.moveToNext()) {
                String string2 = query2.getString(query2.getColumnIndex("data1"));
                if (!TextUtils.isEmpty(string2)) {
                    arrayList3.add(new ContactPerson.ContactMethod(1, string2));
                }
            }
            query2.close();
            if (z) {
                String[] strArr2 = strArr;
                String str = "data1";
                Cursor query3 = contentResolver.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, c, "contact_id = ?", strArr2, (String) null);
                while (query3.moveToNext()) {
                    String string3 = query3.getString(query3.getColumnIndex(str));
                    if (!TextUtils.isEmpty(string3)) {
                        arrayList3.add(new ContactPerson.ContactMethod(2, string3));
                    }
                }
                query3.close();
            }
            if (!arrayList3.isEmpty()) {
                ContactPerson contactPerson = new ContactPerson(mgo.b, (String) null, new AvatarReference(3, ""), arrayList3);
                if (hashSet.add(contactPerson)) {
                    arrayList2.add(contactPerson);
                }
                if (arrayList2.size() >= 6) {
                    break;
                }
            }
            i3++;
            c2 = 0;
        }
        return arrayList2;
    }
}
