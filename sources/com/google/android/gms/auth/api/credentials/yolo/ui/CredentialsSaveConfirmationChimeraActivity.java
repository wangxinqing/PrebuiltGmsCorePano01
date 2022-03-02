package com.google.android.gms.auth.api.credentials.yolo.ui;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class CredentialsSaveConfirmationChimeraActivity extends qcd implements AdapterView.OnItemSelectedListener, View.OnClickListener {
    public static final /* synthetic */ int c = 0;
    private static final iwd d = ehv.b("CredentialsSaveConfirmationActivity");
    public String a;
    public hol b;
    private String e;
    private Credential f;
    private boolean g;
    private List h;
    private Account i;
    private long j;
    private evb k;
    private int l = 1;

    public static Intent a(Context context, String str, Credential credential, boolean z, List list, amri amri, String str2) {
        Intent putExtra = new Intent().setClassName(context, "com.google.android.gms.auth.api.credentials.ui.CredentialsSaveConfirmationActivity").putExtra("app_id", str).putExtra("is_first_use", z).putExtra("available_accounts", (Parcelable[]) list.toArray(new Account[0])).putExtra("selected_account", (Parcelable) amri.c()).putExtra("key_log_session_id", str2);
        ivy.a((SafeParcelable) credential, putExtra, "extra_credentials");
        return putExtra;
    }

    public final void onBackPressed() {
        a(405);
        a(0, 404);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.credential_save_reject) {
            d.b("User declined save.", new Object[0]);
            List list = this.h;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.k.a((Account) list.get(i2), this.e, true);
            }
            a(404);
            a(0, 403);
        } else if (view.getId() == R.id.credential_save_confirm) {
            d.b("User confirmed save.", new Object[0]);
            this.k.b((ihb) new euu(this.i, this.e, this.f));
            this.k.a(this.e);
            a(402);
            a(-1, 401);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        Account account;
        int i2;
        int i3;
        super.onCreate(bundle);
        setTheme(2132017253);
        getWindow().setFlags(262144, 262144);
        setContentView((int) R.layout.credential_save_confirmation);
        Bundle bundle2 = (Bundle) amrh.a(bundle, (Bundle) amrh.a(getIntent().getExtras(), Bundle.EMPTY));
        String string = bundle2.getString("app_id");
        iva.a((Object) string);
        this.e = string;
        this.f = (Credential) ivy.a((byte[]) iva.a((Object) bundle2.getByteArray("extra_credentials")), Credential.CREATOR);
        this.g = bundle2.getBoolean("is_first_use");
        this.h = amym.a((Object[]) (Parcelable[]) iva.a((Object) bundle2.getParcelableArray("available_accounts"))).a(fqz.a).b();
        if (bundle2.get("selected_account") == null) {
            account = (Account) this.h.get(0);
        } else {
            account = (Account) bundle2.getParcelable("selected_account");
        }
        iva.a((Object) account);
        this.i = account;
        this.j = bundle2.getLong("popup_time_millis", SystemClock.elapsedRealtime());
        String string2 = bundle2.getString("key_log_session_id");
        iva.a((Object) string2);
        this.a = string2;
        this.k = eul.a(this, ffx.a(string2).a());
        this.b = new hol(this, "IDENTITY_GMSCORE", (String) null);
        if (awoe.b()) {
            qbt.a(this, this, new fra(this));
        }
        findViewById(R.id.credential_save_reject).setOnClickListener(this);
        findViewById(R.id.credential_save_confirm).setOnClickListener(this);
        boolean isEmpty = TextUtils.isEmpty(this.f.e);
        int size = this.h.size();
        if (size > 1) {
            Spinner spinner = (Spinner) findViewById(R.id.credential_save_account);
            spinner.setAdapter(new frb(this, this.h));
            spinner.setSelection(this.h.indexOf(this.i));
            spinner.setOnItemSelectedListener(this);
            spinner.setVisibility(0);
        }
        if (this.g) {
            a(510);
            View findViewById = findViewById(R.id.google_logo);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
            ViewGroup viewGroup = (ViewGroup) findViewById(R.id.credential_save_confirmation);
            viewGroup.addView(LayoutInflater.from(this).inflate(R.layout.credentials_warm_welcome, viewGroup, false), 0);
            TextView textView = (TextView) findViewById(R.id.credentials_warm_welcome_text);
            Resources resources = getResources();
            textView.setText(a(resources.getString(R.string.credentials_warm_welcome_prefix), resources.getString(R.string.credentials_warm_welcome_link_text), (String) fdj.e.c(), (String) null, true));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            if (Build.VERSION.SDK_INT != 26 && (getResources().getConfiguration().screenLayout & 15) < 3) {
                setRequestedOrientation(1);
            }
            this.k.a();
        }
        TextView textView2 = (TextView) findViewById(R.id.credential_save_text);
        String c2 = hiq.c(this.e);
        String format = String.format("%1s://%2s", new Object[]{getString(R.string.credentials_url_scheme), getString(R.string.credentials_settings_host)});
        if (!isEmpty) {
            i2 = R.string.credentials_save_password_prefix;
        } else {
            i2 = R.string.credentials_save_idp_prefix;
        }
        String format2 = String.format(getString(i2), new Object[]{fbx.a(this, c2)});
        if (size > 1) {
            i3 = R.string.credentials_save_suffix_multiple;
        } else {
            i3 = R.string.credentials_save_suffix_single;
        }
        textView2.setText(a(format2, getString(R.string.credentials_save_link_text), format, getString(i3), false));
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        ((Button) findViewById(R.id.credential_save_confirm)).setText(getResources().getString(!isEmpty ? R.string.credentials_save_confirm_password : R.string.credentials_save_confirm_idp));
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        if (isFinishing()) {
            aucd o = anox.h.o();
            String str = this.e;
            if (o.c) {
                o.c();
                o.c = false;
            }
            anox anox = (anox) o.b;
            str.getClass();
            anox.a |= 32;
            anox.g = str;
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.j;
            if (o.c) {
                o.c();
                o.c = false;
            }
            anox anox2 = (anox) o.b;
            int i2 = anox2.a | 2;
            anox2.a = i2;
            anox2.c = elapsedRealtime;
            int i3 = this.l;
            int i4 = i3 - 1;
            if (i3 != 0) {
                anox2.b = i4;
                int i5 = i2 | 1;
                anox2.a = i5;
                boolean z = this.g;
                anox2.a = i5 | 16;
                anox2.f = z;
                fgm.a().a((anox) o.i());
            } else {
                throw null;
            }
        }
        super.onDestroy();
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i2, long j2) {
        this.i = (Account) this.h.get(i2);
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putString("app_id", this.e);
        bundle.putByteArray("extra_credentials", ivy.a(this.f));
        bundle.putBoolean("is_first_use", this.g);
        bundle.putParcelable("selected_account", this.i);
        bundle.putParcelableArray("available_accounts", (Parcelable[]) this.h.toArray(new Account[0]));
        bundle.putLong("popup_time_millis", this.j);
        bundle.putString("key_log_session_id", this.a);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return super.onTouchEvent(motionEvent);
        }
        Rect rect = new Rect();
        getWindow().getDecorView().getHitRect(rect);
        if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        a(403);
        a(0, 402);
        return true;
    }

    private static Spannable a(String str, String str2, String str3, String str4, boolean z) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(str2);
        spannableStringBuilder.setSpan(new DefensiveURLSpan(str3, z), length, spannableStringBuilder.length(), 33);
        if (!TextUtils.isEmpty(str4)) {
            spannableStringBuilder.append(str4);
        }
        return spannableStringBuilder;
    }

    private final void a(int i2) {
        if (awoe.b()) {
            hol hol = this.b;
            aucd o = anty.n.o();
            String str = this.a;
            if (o.c) {
                o.c();
                o.c = false;
            }
            anty anty = (anty) o.b;
            str.getClass();
            int i3 = anty.a | 2;
            anty.a = i3;
            anty.c = str;
            anty.b = 6;
            anty.a = i3 | 1;
            aucd o2 = antt.f.o();
            String str2 = this.e;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            antt antt = (antt) o2.b;
            str2.getClass();
            int i4 = antt.a | 8;
            antt.a = i4;
            antt.e = str2;
            antt.b = i2 - 1;
            antt.a = i4 | 1;
            antt antt2 = (antt) o2.i();
            if (o.c) {
                o.c();
                o.c = false;
            }
            anty anty2 = (anty) o.b;
            antt2.getClass();
            anty2.h = antt2;
            anty2.a |= 64;
            hol.a((audx) o.i()).b();
        }
    }

    private final void a(int i2, int i3) {
        this.l = i3;
        setResult(i2);
        finish();
    }
}
