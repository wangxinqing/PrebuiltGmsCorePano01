package defpackage;

import android.content.Intent;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.people.data.AudienceMember;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: iia  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iia {
    public final Intent a;

    public iia(Intent intent) {
        this.a = new Intent(intent);
    }

    public static int a(Intent intent, int i) {
        return intent.getIntExtra("com.google.android.gms.common.acl.EXTRA_HEADER_TEXT_COLOR", i);
    }

    public static int b(Intent intent, int i) {
        return intent.getIntExtra("com.google.android.gms.common.acl.EXTRA_HEADER_BACKGROUND_COLOR", i);
    }

    public static AudienceMember c(Intent intent) {
        if (intent.hasExtra("com.google.android.gms.common.acl.EXTRA_UPDATE_PERSON")) {
            return (AudienceMember) ivy.a(intent, "com.google.android.gms.common.acl.EXTRA_UPDATE_PERSON", AudienceMember.CREATOR);
        }
        if (intent.hasExtra("com.google.android.gms.common.acl.EXTRA_UPDATE_PERSON_ID")) {
            return AudienceMember.b(intent.getStringExtra("com.google.android.gms.common.acl.EXTRA_UPDATE_PERSON_ID"), (String) null, (String) null);
        }
        return null;
    }

    public static String d(Intent intent) {
        return intent.getStringExtra("com.google.android.gms.common.acl.EXTRA_TITLE_TEXT");
    }

    public static List e(Intent intent) {
        if (intent.hasExtra("com.google.android.gms.common.acl.EXTRA_INITIAL_AUDIENCE")) {
            return intent.getParcelableArrayListExtra("com.google.android.gms.common.acl.EXTRA_INITIAL_AUDIENCE");
        }
        return Collections.emptyList();
    }

    public static ArrayList f(Intent intent) {
        ArrayList arrayList = new ArrayList();
        List e = e(intent);
        if (e != null && !e.isEmpty()) {
            arrayList.addAll(e);
        }
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("com.google.android.gms.common.acl.EXTRA_REMOVED_AUDIENCE");
        if (parcelableArrayListExtra != null) {
            arrayList.removeAll(parcelableArrayListExtra);
        }
        ArrayList parcelableArrayListExtra2 = intent.getParcelableArrayListExtra("com.google.android.gms.common.acl.EXTRA_ADDED_AUDIENCE");
        if (parcelableArrayListExtra2 != null) {
            arrayList.addAll(parcelableArrayListExtra2);
        }
        return arrayList;
    }

    public static boolean g(Intent intent) {
        return intent.getBooleanExtra("ALL_CIRCLES_CHECKED", false);
    }

    public static boolean h(Intent intent) {
        return intent.getBooleanExtra("ALL_CONTACTS_CHECKED", false);
    }

    public static int i(Intent intent) {
        return intent.getIntExtra("com.google.android.gms.common.acl.EXTRA_DOMAIN_RESTRICTED", 0);
    }

    public static boolean j(Intent intent) {
        return intent.getBooleanExtra("LOAD_CIRCLES", true);
    }

    public static boolean k(Intent intent) {
        return intent.getBooleanExtra("LOAD_PEOPLE", true);
    }

    public static boolean l(Intent intent) {
        return intent.getBooleanExtra("EXTRA_SEARCH_DEVICE", false);
    }

    public iia(String str) {
        this(new Intent(str).setPackage("com.google.android.gms"));
    }

    public static String a(Intent intent) {
        return intent.getStringExtra("DESCRIPTION_TEXT");
    }

    public static String b(Intent intent) {
        return intent.getStringExtra("com.google.android.gms.common.acl.EXTRA_CLIENT_APPLICATION_ID");
    }

    public final void d(String str) {
        this.a.putExtra("com.google.android.gms.common.acl.EXTRA_CLIENT_APPLICATION_ID", str);
    }

    public static ArrayList a(List list) {
        if (list instanceof ArrayList) {
            return (ArrayList) list;
        }
        return new ArrayList(list);
    }

    public final void b(String str) {
        this.a.putExtra("DESCRIPTION_TEXT", str);
    }

    public final /* bridge */ /* synthetic */ void d(boolean z) {
        this.a.putExtra("SHOW_ALL_CIRCLES_CHECKBOX", z);
    }

    public final /* bridge */ /* synthetic */ void e(boolean z) {
        this.a.putExtra("SHOW_ALL_CONTACTS_CHECKBOX", z);
    }

    public final void b(ArrayList arrayList) {
        this.a.putParcelableArrayListExtra("com.google.android.gms.common.acl.EXTRA_REMOVED_AUDIENCE", arrayList);
    }

    public static boolean a(Intent intent, boolean z) {
        return intent.getBooleanExtra("SHOULD_LOAD_GROUPS", z);
    }

    public final void b(List list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.a.putParcelableArrayListExtra("com.google.android.gms.common.acl.EXTRA_INITIAL_AUDIENCE", a(list));
    }

    public final ArrayList c() {
        return f(this.a);
    }

    public final void a(int i) {
        this.a.putExtra("com.google.android.gms.common.acl.EXTRA_DOMAIN_RESTRICTED", i);
    }

    public final void c(String str) {
        this.a.putExtra("com.google.android.gms.common.acl.EXTRA_PLUS_PAGE_ID", str);
    }

    public final void a(AudienceMember audienceMember) {
        ivy.a((SafeParcelable) audienceMember, this.a, "com.google.android.gms.common.acl.EXTRA_UPDATE_PERSON");
    }

    public final void b(boolean z) {
        this.a.putExtra("ALL_CONTACTS_CHECKED", z);
    }

    public final /* bridge */ /* synthetic */ void c(boolean z) {
        this.a.putExtra("HAS_SHOW_CIRCLES", z);
    }

    public final void a(String str) {
        this.a.putExtra("com.google.android.gms.common.acl.EXTRA_ACCOUNT_NAME", str);
    }

    public final boolean b() {
        return h(this.a);
    }

    public final void a(ArrayList arrayList) {
        this.a.putParcelableArrayListExtra("com.google.android.gms.common.acl.EXTRA_ADDED_AUDIENCE", arrayList);
    }

    public final void a(boolean z) {
        this.a.putExtra("ALL_CIRCLES_CHECKED", z);
    }

    public final boolean a() {
        return g(this.a);
    }
}
