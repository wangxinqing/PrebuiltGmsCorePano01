package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.google.android.gms.R;
import java.util.Locale;

/* renamed from: wms  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wms {
    public static Bundle a;
    public static Bundle b;
    private static Locale c;

    public static void a(Context context) {
        Locale locale = Locale.getDefault();
        if (!locale.equals(c)) {
            Bundle bundle = new Bundle();
            Resources resources = context.getResources();
            a(bundle, 1, ContactsContract.CommonDataKinds.Email.getTypeLabel(resources, 1, (CharSequence) null));
            a(bundle, 2, ContactsContract.CommonDataKinds.Email.getTypeLabel(resources, 2, (CharSequence) null));
            a = bundle;
            Bundle bundle2 = new Bundle();
            Resources resources2 = context.getResources();
            a(bundle2, 1, ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources2, 1, (CharSequence) null));
            a(bundle2, 2, ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources2, 3, (CharSequence) null));
            a(bundle2, 3, ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources2, 2, (CharSequence) null));
            a(bundle2, 4, ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources2, 5, (CharSequence) null));
            a(bundle2, 5, ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources2, 4, (CharSequence) null));
            a(bundle2, 6, ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources2, 13, (CharSequence) null));
            a(bundle2, 7, ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources2, 6, (CharSequence) null));
            a(bundle2, 8, ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources2, 10, (CharSequence) null));
            a(bundle2, 9, ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources2, 19, (CharSequence) null));
            a(bundle2, 10, ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources2, 9, (CharSequence) null));
            a(bundle2, 11, ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources2, 14, (CharSequence) null));
            a(bundle2, 12, ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources2, 11, (CharSequence) null));
            a(bundle2, 13, ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources2, 8, (CharSequence) null));
            a(bundle2, 14, ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources2, 15, (CharSequence) null));
            a(bundle2, 15, ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources2, 16, (CharSequence) null));
            a(bundle2, 16, ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources2, 17, (CharSequence) null));
            a(bundle2, 17, ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources2, 18, (CharSequence) null));
            a(bundle2, 18, ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources2, 12, (CharSequence) null));
            a(bundle2, 19, resources2.getString(R.string.people_google_voice_phone_label));
            b = bundle2;
            c = locale;
        }
    }

    private static void a(Bundle bundle, int i, CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            bundle.putString(String.valueOf(i), charSequence.toString());
        }
    }
}
