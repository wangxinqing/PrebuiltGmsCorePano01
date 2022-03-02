package defpackage;

import android.content.Intent;
import android.os.Bundle;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: dwc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dwc {
    public final Intent a;

    public dwc() {
        Intent intent = new Intent("com.google.android.gms.appinvite.ACTION_CONTEXTUAL_PEOPLE_SELECTION");
        this.a = intent;
        intent.setPackage("com.google.android.gms");
    }

    public final void a() {
        this.a.putExtra("com.google.android.gms.appinvite.CONTEXT_CONTACT_METHOD_SELECTION", true);
    }

    public final void b() {
        this.a.putExtra("com.google.android.gms.appinvite.CONTEXT_DOCK_RECIPIENTS", true);
    }

    public final void c() {
        this.a.putExtra("com.google.android.gms.appinvite.CONTEXT_MAX_PORTRAIT_GRID_ITEMS", 6);
        this.a.putExtra("com.google.android.gms.appinvite.CONTEXT_MAX_LANDSCAPE_GRID_ITEMS", 6);
    }

    public final void a(int i) {
        this.a.putExtra("com.google.android.gms.appinvite.CONTEXT_MAX_SELECTED", i);
    }

    public final void b(int i) {
        this.a.putExtra("com.google.android.gms.appinvite.CONTEXT_ACTION_BAR_TEXT_APPEARANCE", i);
    }

    public final void c(int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putIntArray(Integer.toString(0), new int[]{i2, -16842910});
        bundle.putIntArray(Integer.toString(1), new int[]{i});
        this.a.putExtra("com.google.android.gms.appinvite.CONTEXT_CONFIRM_BUTTON_TEXT_COLOR_STATES", bundle);
    }

    public final void a(int i, int i2) {
        this.a.putExtra("com.google.android.gms.appinvite.CONTEXT_ACTION_BAR_TEXT_COLOR", i);
        this.a.putExtra("com.google.android.gms.appinvite.CONTEXT_ACTION_BAR_BACKGROUND_COLOR", i2);
    }

    public final void b(int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putIntArray(Integer.toString(0), new int[]{i2, -16842910});
        bundle.putIntArray(Integer.toString(1), new int[]{i});
        this.a.putExtra("com.google.android.gms.appinvite.CONTEXT_CONFIRM_BUTTON_BACKGROUND_COLOR_STATES", bundle);
    }

    public final void a(String str) {
        this.a.putExtra("com.google.android.gms.appinvite.CONTEXT_ACCOUNT_NAME", str);
    }

    public final void a(String[] strArr) {
        if (awhs.c() || awhs.b()) {
            HashSet hashSet = new HashSet(Arrays.asList(strArr));
            if (hashSet.remove("google_no_icon") && awhs.c()) {
                this.a.putExtra("com.google.android.gms.appinvite.CONTEXT_CONTACT_METHOD_ICON", true);
            }
            if (hashSet.remove("exclude_non_gaia") && awhs.b()) {
                this.a.putExtra("com.google.android.gms.appinvite.EXTRA_EXCLUDE_NON_GAIA_CONTACTS", true);
            }
            this.a.putExtra("com.google.android.gms.appinvite.CONTEXT_CONTACT_METHOD_TYPES", (String[]) hashSet.toArray(new String[hashSet.size()]));
            return;
        }
        this.a.putExtra("com.google.android.gms.appinvite.CONTEXT_CONTACT_METHOD_TYPES", strArr);
    }

    public final void c(String str) {
        this.a.putExtra("com.google.android.gms.appinvite.CONTEXT_LIST_SOURCE", str);
    }

    public final void b(String str) {
        this.a.putExtra("com.google.android.gms.appinvite.CONTEXT_GRID_SOURCE", str);
    }
}
