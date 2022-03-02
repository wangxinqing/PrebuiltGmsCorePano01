package com.google.android.gms.auth.api.credentials.yolo.ui;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.chimera.Activity;
import com.google.android.chimera.FragmentActivity;
import com.google.android.gms.R;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.auth.api.credentials.internal.InternalCredentialWrapper;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CredentialPickerChimeraActivity extends qcd implements View.OnClickListener, AdapterView.OnItemClickListener {
    public String a;
    public amri b;
    public amri c;
    public amri d;
    public amri e = ampu.a;
    public fqx f;
    public ListView g;
    public jgs h;
    public evb i;
    public String j;
    public hol k;
    private boolean l;
    private long m;
    private qao n;
    private int o;
    private int p = 1;

    private final void a(int i2) {
        if (awoe.b()) {
            hol hol = this.k;
            aucd o2 = anty.n.o();
            String str = this.j;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anty anty = (anty) o2.b;
            str.getClass();
            int i3 = anty.a | 2;
            anty.a = i3;
            anty.c = str;
            anty.b = 6;
            anty.a = i3 | 1;
            aucd o3 = antt.f.o();
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            antt antt = (antt) o3.b;
            antt.b = i2 - 1;
            int i4 = antt.a | 1;
            antt.a = i4;
            String str2 = this.a;
            str2.getClass();
            antt.a = i4 | 8;
            antt.e = str2;
            antt antt2 = (antt) o3.i();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anty anty2 = (anty) o2.b;
            antt2.getClass();
            anty2.h = antt2;
            anty2.a |= 64;
            hol.a((audx) o2.i()).b();
        }
    }

    public final void e() {
        this.g.setEnabled(false);
        View findViewById = findViewById(R.id.progress_indicator_container);
        ImageView imageView = (ImageView) findViewById(R.id.progress_indicator);
        findViewById.setVisibility(0);
        if (this.h == null) {
            jgs jgs = new jgs(getContainerActivity(), findViewById(R.id.progress_indicator));
            this.h = jgs;
            jgs.setAlpha(255);
            this.h.a(0);
            this.h.a(-12417548);
        }
        imageView.setImageDrawable(this.h);
        this.h.start();
    }

    public final CredentialPickerConfig f() {
        if (this.b.a()) {
            return ((HintRequest) this.b.b()).b;
        }
        return ((CredentialRequest) this.c.b()).d;
    }

    public final void onBackPressed() {
        int i2;
        int i3;
        if (!this.c.a()) {
            i2 = 106;
        } else {
            i2 = 206;
        }
        a(0, i2);
        if (!this.c.a()) {
            i3 = 107;
        } else {
            i3 = 207;
        }
        a(i3);
    }

    public void onClick(View view) {
        int i2;
        int i3;
        int i4;
        int id = view.getId();
        if (id == R.id.add_account) {
            if (!this.c.a()) {
                i3 = 104;
            } else {
                i3 = 204;
            }
            a(ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, i3);
            if (!this.c.a()) {
                i4 = 105;
            } else {
                i4 = 205;
            }
            a(i4);
        } else if (id == R.id.cancel) {
            if (!this.c.a()) {
                i2 = 102;
            } else {
                i2 = 202;
            }
            a(1001, i2);
            a(!this.c.a() ? 103 : 203);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        amri amri;
        amri amri2;
        String str;
        amri amri3;
        super.onCreate(bundle);
        setTheme(2132017253);
        Bundle bundle2 = (Bundle) amrh.a(bundle, (Bundle) amrh.a(getIntent().getExtras(), Bundle.EMPTY));
        ClassLoader classLoader = CredentialRequest.class.getClassLoader();
        iva.a((Object) classLoader);
        bundle2.setClassLoader(classLoader);
        String a2 = jhg.a((Activity) this);
        if (a2 != null) {
            String string = bundle2.getString("claimedCallingPackage");
            if (string == null || amqx.a(a2, string)) {
                amri = amri.b(a2);
            } else {
                amri = !hya.a((Context) this).b(a2) ? ampu.a : amri.b(string);
            }
        } else {
            amri = ampu.a;
        }
        if (amri.a()) {
            amri2 = hiq.a(this, (String) amri.b());
        } else {
            amri2 = ampu.a;
        }
        this.l = bundle2.getBoolean("firstTime");
        if (TextUtils.isEmpty(bundle2.getString("logSessionId"))) {
            str = qbw.a();
        } else {
            str = bundle2.getString("logSessionId");
            iva.a((Object) str);
        }
        this.j = str;
        this.m = bundle2.getLong("popupTimeMillis", SystemClock.elapsedRealtime());
        this.c = ampu.a;
        byte[] byteArray = bundle2.getByteArray("credentialRequest");
        if (byteArray != null) {
            this.c = amri.c((CredentialRequest) ivy.a(byteArray, CredentialRequest.CREATOR));
        }
        Object obj = bundle2.get("com.google.android.gms.credentials.HintRequest");
        if (obj == null) {
            amri3 = ampu.a;
        } else if (obj instanceof byte[]) {
            amri3 = amri.b((HintRequest) ivy.a((byte[]) obj, HintRequest.CREATOR));
        } else {
            amri3 = amri.b((HintRequest) obj);
        }
        this.b = amri3;
        this.d = ampu.a;
        byte[] byteArray2 = bundle2.getByteArray("selectedCredential");
        if (byteArray2 != null) {
            this.d = amri.c((InternalCredentialWrapper) ivy.a(byteArray2, InternalCredentialWrapper.CREATOR));
        }
        this.k = new hol(this, "IDENTITY_GMSCORE", (String) null);
        if (!amri2.a()) {
            this.a = "";
            a(2);
            a(0, 2);
            return;
        }
        this.a = (String) amri2.b();
        if (this.c.a() || this.b.a()) {
            getWindow().addFlags(262144);
            getWindow().addFlags(2);
            this.n = qao.a((FragmentActivity) this);
            this.i = eul.a(this, ffx.a(this.j).a());
            if (this.c.a()) {
                setContentView((int) R.layout.credential_picker_activity);
            } else {
                setContentView((int) R.layout.credential_hint_picker_activity);
            }
            findViewById(R.id.credential_picker_layout).setContentDescription(getString(!this.c.a() ? R.string.credentials_hint_ally_announce : R.string.credentials_picker_ally_announce));
            findViewById(R.id.add_account).setVisibility(8);
            this.g = (ListView) findViewById(R.id.credential_picker_options);
            fqx fqx = new fqx(this, new ArrayList());
            this.f = fqx;
            this.g.setAdapter(fqx);
            this.g.setOnItemClickListener(this);
            TextView textView = (TextView) findViewById(R.id.credentials_warm_welcome_text);
            if (textView != null) {
                Resources resources = getResources();
                String string2 = resources.getString(R.string.credentials_warm_welcome_prefix);
                String string3 = resources.getString(R.string.credentials_warm_welcome_link_text);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2);
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append(string3);
                spannableStringBuilder.setSpan(new DefensiveURLSpan((String) fdj.e.c(), true), length, spannableStringBuilder.length(), 33);
                if (!TextUtils.isEmpty((CharSequence) null)) {
                    spannableStringBuilder.append((CharSequence) null);
                }
                textView.setText(spannableStringBuilder);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
            }
            if (this.l && this.c.a()) {
                View findViewById = findViewById(R.id.google_logo);
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                }
                if (Build.VERSION.SDK_INT != 26 && (getResources().getConfiguration().screenLayout & 15) < 3) {
                    setRequestedOrientation(1);
                }
            } else {
                View findViewById2 = findViewById(R.id.credentials_warm_welcome_layout);
                if (findViewById2 != null) {
                    findViewById2.setVisibility(8);
                }
                if (this.b.a()) {
                    TextView textView2 = (TextView) findViewById(R.id.credentials_hint_picker_title);
                    int i2 = f().d;
                    if (!(i2 == 1 || i2 == 2 || i2 == 3)) {
                        i2 = 1;
                    }
                    int i3 = R.string.credentials_hint_picker_title_continue;
                    if (i2 != 1) {
                        if (i2 == 2) {
                            i3 = R.string.credentials_hint_picker_title;
                        } else if (i2 == 3) {
                            i3 = R.string.credentials_hint_picker_title_new_account;
                        }
                    }
                    textView2.setText(i3);
                }
            }
            e();
            if (this.l && this.c.a()) {
                this.i.a();
            }
            if (awoe.b()) {
                qbt.a(this, this, new fql(this));
            }
            aorl.a(this.n.a(1, new fqm(this)), new fqu(this), aoqm.a);
            return;
        }
        a(0, 2);
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        if (isFinishing()) {
            aucd o2 = anox.h.o();
            String str = this.a;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anox anox = (anox) o2.b;
            str.getClass();
            anox.a |= 32;
            anox.g = str;
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.m;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anox anox2 = (anox) o2.b;
            int i2 = anox2.a | 2;
            anox2.a = i2;
            anox2.c = elapsedRealtime;
            int i3 = this.p;
            int i4 = i3 - 1;
            if (i3 != 0) {
                anox2.b = i4;
                int i5 = i2 | 1;
                anox2.a = i5;
                boolean z = this.l;
                anox2.a = i5 | 16;
                anox2.f = z;
                int size = this.e.a() ? ((amzy) this.e.b()).size() : -1;
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                anox anox3 = (anox) o2.b;
                int i6 = anox3.a | 8;
                anox3.a = i6;
                anox3.e = size;
                int i7 = this.o;
                if (i7 != -1) {
                    anox3.a = i6 | 4;
                    anox3.d = i7;
                }
                fgm.a().a((anox) o2.i());
            } else {
                throw null;
            }
        }
        super.onDestroy();
    }

    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        this.g.setEnabled(false);
        this.o = i2;
        a((InternalCredentialWrapper) ((amzy) this.e.b()).get(i2));
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putLong("popupTimeMillis", this.m);
        bundle.putBoolean("firstTime", this.l);
        bundle.putString("claimedCallingPackage", hiq.c(this.a));
        if (this.c.a()) {
            bundle.putByteArray("credentialRequest", ivy.a((CredentialRequest) this.c.b()));
        }
        if (this.b.a()) {
            bundle.putByteArray("com.google.android.gms.credentials.HintRequest", ivy.a((HintRequest) this.b.b()));
        }
        if (this.d.a()) {
            bundle.putByteArray("selectedCredential", ivy.a((InternalCredentialWrapper) this.d.b()));
        }
        String str = this.j;
        if (str != null) {
            bundle.putString("logSessionId", str);
        }
        super.onSaveInstanceState(bundle);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i2;
        int i3;
        if (motionEvent.getAction() != 0) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.f.isEmpty()) {
            return true;
        }
        Rect rect = new Rect();
        getWindow().getDecorView().getHitRect(rect);
        if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        if (!this.c.a()) {
            i2 = 103;
        } else {
            i2 = 203;
        }
        a(0, i2);
        if (!this.c.a()) {
            i3 = 104;
        } else {
            i3 = 204;
        }
        a(i3);
        return true;
    }

    /* access modifiers changed from: private */
    public final void a(int i2, int i3, Credential credential) {
        this.p = i3;
        Intent intent = new Intent();
        if (credential != null) {
            intent.putExtra("com.google.android.gms.credentials.Credential", credential);
        }
        setResult(i2, intent);
        finish();
    }

    public final void a(int i2, int i3) {
        a(i2, i3, (Credential) null);
    }

    public final void a(InternalCredentialWrapper internalCredentialWrapper) {
        this.g.postDelayed(new fqn(this), 400);
        this.i.a(this.a);
        this.d = amri.b(internalCredentialWrapper);
        if (this.c.a()) {
            Account account = internalCredentialWrapper.b;
            iva.a((Object) account);
            aorl.a(this.n.a(2, new fqo(this, account, internalCredentialWrapper)), new fqv(this), aoqm.a);
        } else {
            Credential credential = internalCredentialWrapper.a;
            eug eug = new eug(credential);
            eug.c = amzy.h();
            amri d2 = anbs.d(jgu.d(this, getPackageName()), new fqp(credential));
            if (!((HintRequest) this.b.b()).f || !d2.a()) {
                a(-1, 101, eug.a());
            } else {
                aorl.a(this.n.a(2, new fqq(this, d2)), new fqw(this, eug), aoqm.a);
            }
        }
        int i2 = this.o;
        if (awoe.b()) {
            hol hol = this.k;
            aucd o2 = anty.n.o();
            String str = this.j;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anty anty = (anty) o2.b;
            str.getClass();
            int i3 = anty.a | 2;
            anty.a = i3;
            anty.c = str;
            anty.b = 6;
            anty.a = i3 | 1;
            aucd o3 = antt.f.o();
            int i4 = !this.c.a() ? 102 : 202;
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            antt antt = (antt) o3.b;
            antt.b = i4 - 1;
            antt.a |= 1;
            int size = ((amzy) this.e.b()).size();
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            antt antt2 = (antt) o3.b;
            int i5 = antt2.a | 4;
            antt2.a = i5;
            antt2.d = size;
            int i6 = i5 | 2;
            antt2.a = i6;
            antt2.c = i2;
            String str2 = this.a;
            str2.getClass();
            antt2.a = i6 | 8;
            antt2.e = str2;
            antt antt3 = (antt) o3.i();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anty anty2 = (anty) o2.b;
            antt3.getClass();
            anty2.h = antt3;
            anty2.a |= 64;
            hol.a((audx) o2.i()).b();
        }
    }
}
