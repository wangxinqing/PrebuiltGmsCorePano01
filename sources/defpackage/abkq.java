package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.provider.ContactsContract;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.MenuItem;
import android.widget.Toast;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import java.util.Set;

/* renamed from: abkq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abkq extends abkp implements abkk, abga, ablg {
    static final Intent d = new Intent("android.intent.action.VIEW", Uri.parse(azje.b()));
    private final Activity e;
    private final abkt f;
    private final abkl g;
    private final Toast h = Toast.makeText(this.b, R.string.added_to_favorites, 0);
    private final jtf i;
    private int j;
    private int k;
    private boolean l;
    private boolean m;
    private boolean n;

    public abkq(Activity activity, Toolbar toolbar, abkl abkl, abkt abkt, jtf jtf) {
        super(activity, toolbar);
        this.e = activity;
        this.f = abkt;
        this.g = abkl;
        this.i = jtf;
        if (azim.b()) {
            this.j = 0;
            abkl.a((abkk) this);
            return;
        }
        abkl.a((abkk) this);
        this.a.findItem(R.id.menu_star_contact).setShowAsAction(1);
        this.j = 0;
    }

    private final void l() {
        boolean z;
        int i2;
        int i3;
        if (azim.b()) {
            int i4 = this.j;
            if (i4 != 0) {
                if (!this.n || this.m || i4 != 1) {
                    k();
                } else {
                    j();
                }
                if (!this.n || this.m || this.l || this.j != 2) {
                    i();
                } else {
                    h();
                }
            }
        } else if (!this.l && !this.m) {
            int i5 = this.j;
            if (i5 == 1) {
                int i6 = this.k;
                if (i6 == 3) {
                    z = true;
                } else {
                    z = false;
                }
                this.c = z;
                if (i6 == 3) {
                    i2 = R.string.unstar_contact_content_description;
                } else {
                    i2 = R.string.star_contact_content_description;
                }
                if (i6 == 3) {
                    i3 = R.drawable.quantum_ic_star_vd_theme_24;
                } else {
                    i3 = R.drawable.quantum_ic_star_border_vd_theme_24;
                }
                MenuItem findItem = this.a.findItem(R.id.menu_star_contact);
                findItem.setIcon(i3);
                pk.a(findItem, (CharSequence) this.b.getString(i2));
                findItem.setVisible(true);
                i();
                j();
            } else if (i5 == 2) {
                g();
                h();
                k();
            }
        } else {
            g();
            i();
            if (this.m || this.j != 1) {
                k();
            } else {
                j();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.g.a(true);
        this.h.setText(R.string.added_to_favorites);
        this.h.show();
        this.i.a(jth.STAR_BUTTON, jth.SMART_PROFILE_HEADER);
    }

    /* access modifiers changed from: protected */
    public final void b() {
        this.g.a(false);
        this.h.setText(R.string.removed_from_favorites);
        this.h.show();
        this.i.a(jth.UNSTAR_BUTTON, jth.SMART_PROFILE_HEADER);
    }

    /* access modifiers changed from: protected */
    public final void c() {
        this.g.a();
        this.i.a(jth.ADD_TO_CONTACTS_BUTTON, jth.OVERFLOW_MENU, jth.SMART_PROFILE_HEADER);
    }

    /* access modifiers changed from: protected */
    public final void d() {
        abkl abkl = this.g;
        Set a = abkl.a(abkl.b);
        if (a.size() == 1) {
            abkn abkn = abkl.d;
            Intent intent = new Intent("android.intent.action.EDIT");
            intent.setDataAndType(Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_URI, (String) a.iterator().next()), "vnd.android.cursor.item/contact");
            int i2 = Build.VERSION.SDK_INT;
            intent.putExtra("finishActivityOnSaveCompleted", true);
            abkn.a.startActivityForResult(intent, 2);
        } else if (a.size() > 1) {
            abkn abkn2 = abkl.d;
            Intent className = new Intent().setClassName(ihs.b(), "com.google.android.gms.smart_profile.ContactsPickerActivity");
            className.putExtra("com.google.android.gms.people.smart_profile.QUALIFIED_ID", abkn2.b);
            className.putExtra("com.google.android.gms.people.smart_profile.VIEWER_ACCOUNT_NAME", abkn2.c);
            className.putExtra("com.google.android.gms.people.smart_profile.VIEWER_PAGE_ID", abkn2.d);
            className.putExtra("com.google.android.gms.people.smart_profile.APPLICATION_ID", abkn2.e);
            className.putExtra("com.google.android.gms.people.smart_profile.CALLING_PACKAGE", abkn2.f);
            abkn2.a.startActivity(className);
        }
        this.i.a(jth.EDIT_CONTACT_BUTTON, jth.OVERFLOW_MENU, jth.SMART_PROFILE_HEADER);
    }

    /* access modifiers changed from: protected */
    public final void e() {
        this.e.startActivity(d);
        this.i.a(jth.EDIT_PROFILE_BUTTON, jth.OVERFLOW_MENU, jth.SMART_PROFILE_HEADER);
    }

    /* access modifiers changed from: protected */
    public final void f() {
        Bitmap bitmap;
        abkt abkt = this.f;
        iby iby = abkt.d;
        mwc mwc = new mwc();
        mwc.c = abkt.a;
        mwc.a = abkt.b;
        try {
            abkt.c.setDrawingCacheEnabled(true);
            bitmap = abkt.c.getDrawingCache();
        } catch (Exception e2) {
            bitmap = null;
        }
        mwc.a(bitmap);
        iby.a(mwc.a());
        this.i.a(jth.SEND_FEEDBACK_BUTTON, jth.OVERFLOW_MENU, jth.SMART_PROFILE_HEADER);
    }

    public final void a(int i2, int i3) {
        this.j = i2;
        this.k = i3;
        l();
    }

    public final void a(abgl abgl) {
        boolean z = false;
        if (abgl.c() && abgl.d.e) {
            z = true;
        }
        this.l = z;
        l();
    }

    public final void a(boolean z) {
        this.m = z;
        this.n = true;
        l();
        if (azhl.a.a().d()) {
            String stringExtra = this.e.getIntent().getStringExtra("com.google.android.gms.people.smart_profile.VIEWER_ACCOUNT_NAME");
            Uri.Builder appendQueryParameter = Uri.parse("https://accounts.google.com/accountchooser").buildUpon().appendQueryParameter("continue", azje.b());
            if (!TextUtils.isEmpty(stringExtra)) {
                appendQueryParameter.appendQueryParameter("Email", stringExtra).build();
            }
            d.setData(appendQueryParameter.build());
        }
        if (z && d.resolveActivity(this.e.getPackageManager()) != null) {
            this.a.findItem(R.id.edit_profile).setVisible(true);
        }
    }
}
