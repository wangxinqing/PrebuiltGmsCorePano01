package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.net.Uri;
import android.os.Build;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;

/* renamed from: wor  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wor extends wnb {
    private static final String[] g = {"_id"};
    private final String[] c;
    private final int d;
    private final int e;
    private final String f;

    public wor(String str, int i, wzv wzv, String[] strArr, int i2) {
        super(str, i, wzv, (String) null, "SendInteractionFeedback");
        this.c = strArr;
        this.d = i2;
        this.e = i;
        this.f = str;
    }

    /* JADX INFO: finally extract failed */
    public final Pair c(Context context) {
        Uri uri;
        String str;
        if (new xuv(context, this.f, this.e).a()) {
            String[] strArr = this.c;
            int i = this.d;
            int i2 = Build.VERSION.SDK_INT;
            StringBuilder sb = new StringBuilder();
            sb.append("data1 IN(");
            int length = strArr.length;
            String str2 = "";
            int i3 = 0;
            while (i3 < length) {
                String str3 = strArr[i3];
                sb.append(str2);
                if (!TextUtils.isEmpty(str3)) {
                    DatabaseUtils.appendEscapedSQLString(sb, str3);
                }
                i3++;
                str2 = ",";
            }
            sb.append(")");
            ArrayList arrayList = new ArrayList();
            Cursor query = context.getContentResolver().query(ContactsContract.Data.CONTENT_URI, g, sb.toString(), (String[]) null, (String) null);
            if (query != null) {
                while (query.moveToNext()) {
                    try {
                        arrayList.add(String.valueOf(query.getLong(0)));
                    } catch (Throwable th) {
                        query.close();
                        throw th;
                    }
                }
                query.close();
                if (arrayList.size() != 0) {
                    Uri.Builder appendPath = ContactsContract.DataUsageFeedback.FEEDBACK_URI.buildUpon().appendPath(TextUtils.join(",", arrayList));
                    if (i != 0) {
                        str = i != 2 ? "long_text" : "call";
                    } else {
                        str = "short_text";
                    }
                    uri = appendPath.appendQueryParameter("type", str).build();
                } else {
                    uri = null;
                }
            } else {
                Log.w("BasePeopleOperation", "Failed to query from cp2");
                uri = null;
            }
            if (uri != null) {
                context.getContentResolver().update(uri, new ContentValues(), (String) null, (String[]) null);
            }
        } else {
            Log.w("BasePeopleOperation", "READ_CONTACTS permission is missing. Skipping SendInteractionFeedbackOperation.");
        }
        return new Pair(xqy.c, (Object) null);
    }
}
