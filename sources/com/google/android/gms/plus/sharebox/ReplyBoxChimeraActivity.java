package com.google.android.gms.plus.sharebox;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.text.Spannable;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentActivity;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.R;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.plus.model.posts.Comment;
import com.google.android.gms.plus.model.posts.PlusPage;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ReplyBoxChimeraActivity extends FragmentActivity implements zlv, zlr, zkz {
    private zls a;
    private zlw b;
    private Audience c;
    private yqd d;
    private String e;
    private zms f;
    private final Handler g = new zlp(this);

    private final void a(int i) {
        b(i);
        j();
    }

    private final void b(int i) {
        Toast.makeText(this, i, 0).show();
    }

    private final void h() {
        if (((znc) getSupportFragmentManager().findFragmentByTag("post_error_dialog")) == null) {
            znc.a((int) R.string.plus_replybox_post_error_message).show(getSupportFragmentManager(), "post_error_dialog");
        }
    }

    private final void i() {
        a((int) R.string.plus_replybox_internal_error);
    }

    private final void j() {
        setResult(0);
        finish();
    }

    public final yqd a() {
        return this.d;
    }

    public final zlw b() {
        return this.b;
    }

    public final void c() {
        this.b.a(iax.a);
        j();
    }

    public final zms d() {
        return this.f;
    }

    public final void e() {
        this.a.b();
    }

    public final void f() {
        zls zls = this.a;
        zls.a(zls.a());
    }

    public final void g() {
        Comment comment;
        zls zls = this.a;
        if (!zls.a()) {
            zls.c.b().a(iax.f);
            comment = null;
        } else {
            jjw.a(zls.getActivity(), zls.f);
            if (zmf.a(zls.getActivity(), zls.c.d().f)) {
                zls.c.b().a(iax.e);
            }
            comment = new Comment(1, (String) null, zls.c.d().g, zmf.a((Spannable) zls.f.getText()), zls.c.d().f, zls.c.d().b());
        }
        if (comment != null) {
            znf a2 = znf.a((CharSequence) getString(R.string.plus_sharebox_post_pending));
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            beginTransaction.add((Fragment) a2, "progress_dialog");
            beginTransaction.commitAllowingStateLoss();
            zlw zlw = this.b;
            if (!zlw.g) {
                zlw.g = true;
                zlw.h = comment;
                if (zlw.b.l()) {
                    zlw.c.g(Bundle.EMPTY);
                } else if (!zlw.b.m()) {
                    zlw.b.t();
                }
            } else {
                throw new IllegalStateException("One comment at a time please");
            }
        } else {
            h();
        }
    }

    public final String getCallingPackage() {
        return this.e;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 != -1) {
            StringBuilder sb = new StringBuilder(49);
            sb.append("Failed to resolve connection/account: ");
            sb.append(i2);
            Log.e("ReplyBox", sb.toString());
            i();
        }
    }

    public final void onBackPressed() {
        if (this.a.b) {
            this.g.sendEmptyMessage(1);
            return;
        }
        this.b.a(iax.a);
        super.onBackPressed();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String a2 = jhg.a((Activity) this);
        this.e = a2;
        if (jgu.d(this, a2).isEmpty()) {
            Log.e("ReplyBox", "No accounts available to reply");
            i();
        } else if (!jkf.a(this)) {
            a((int) R.string.plus_replybox_no_network_connection);
        } else {
            String str = this.e;
            Intent intent = getIntent();
            if ("com.google.android.gms.plus.action.REPLY_INTERNAL_GOOGLE".equals(intent.getAction())) {
                if (intent.hasExtra("com.google.android.gms.plus.intent.extra.CLIENT_CALLING_PACKAGE")) {
                    Log.e("ReplyBox", "Cannot override the calling package when using the action: com.google.android.gms.plus.action.REPLY_INTERNAL_GOOGLE");
                } else if (TextUtils.isEmpty(str)) {
                    Log.e("ReplyBox", "Must use startActivityForResult when using the action: com.google.android.gms.plus.action.REPLY_INTERNAL_GOOGLE");
                } else if (hya.a((Context) this).b(str)) {
                    zms zms = new zms(getIntent());
                    this.f = zms;
                    Intent intent2 = getIntent();
                    String stringExtra = intent2.getStringExtra("com.google.android.gms.plus.intent.extra.PLUS_PAGE_ID");
                    if (!TextUtils.isEmpty(stringExtra)) {
                        zms.b = new PlusPage(stringExtra, (String) null, (String) null);
                    }
                    zms.g = intent2.getStringExtra("com.google.android.gms.plus.intent.extra.INTERNAL_REPLY_ACTIVITY_ID");
                    zms.h = intent2.getStringExtra("com.google.android.gms.plus.intent.extra.INTERNAL_REPLY_ADD_COMMENT_HINT");
                    zms.f = intent2.getStringExtra("com.google.android.gms.plus.intent.extra.SHARE_CONTEXT_TYPE");
                    zms.m = intent2.getStringExtra("com.google.android.gms.plus.intent.extra.CLIENT_APPLICATION_ID");
                    if (!this.f.a()) {
                        Log.e("ReplyBox", "No account name provided.");
                        i();
                        return;
                    } else if (!TextUtils.isEmpty(this.f.g)) {
                        setContentView((int) R.layout.plus_replybox_activity);
                        if (bundle != null) {
                            this.c = (Audience) bundle.getParcelable("audience");
                        } else {
                            this.c = iww.a;
                        }
                        this.d = new yqd(this.c);
                        FragmentManager supportFragmentManager = getSupportFragmentManager();
                        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
                        zlw zlw = (zlw) supportFragmentManager.findFragmentByTag("reply_worker_fragment");
                        this.b = zlw;
                        if (zlw == null) {
                            zlw a3 = zlw.a(this.f.a);
                            this.b = a3;
                            beginTransaction.add((Fragment) a3, "reply_worker_fragment");
                        }
                        zls zls = (zls) supportFragmentManager.findFragmentByTag("reply_fragment");
                        this.a = zls;
                        if (zls == null) {
                            zls zls2 = new zls();
                            this.a = zls2;
                            beginTransaction.add(R.id.post_container, zls2, "reply_fragment");
                        }
                        beginTransaction.show(this.a);
                        beginTransaction.commit();
                        return;
                    } else {
                        Log.e("ReplyBox", "No activity ID provided.");
                        i();
                        return;
                    }
                }
            }
            Log.e("ReplyBox", "Invalid reply action");
            j();
        }
    }

    public final void onResume() {
        super.onResume();
        zla zla = (zla) getSupportFragmentManager().findFragmentByTag("confirm_action_dialog");
        if (zla != null) {
            zla.a = this;
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("audience", this.c);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View findViewById = findViewById(R.id.post_container);
        if (motionEvent.getAction() != 0 || !jgv.a(motionEvent, findViewById)) {
            return super.onTouchEvent(motionEvent);
        }
        onBackPressed();
        jjw.a(this, findViewById);
        return true;
    }

    public final void a(ConnectionResult connectionResult) {
        if (connectionResult == null) {
            i();
        } else if (connectionResult.a()) {
            try {
                connectionResult.a(getContainerActivity());
            } catch (IntentSender.SendIntentException e2) {
                Log.e("ReplyBox", "Failed to start connection resolution");
                i();
            }
        } else {
            Log.e("ReplyBox", "Failed connection resolution");
            i();
        }
    }

    public final void b(ConnectionResult connectionResult) {
        znf znf = (znf) getSupportFragmentManager().findFragmentByTag("progress_dialog");
        if (znf != null) {
            znf.dismiss();
        }
        if (connectionResult.b()) {
            this.b.a(iax.d);
            b((int) R.string.plus_replybox_post_success);
            setResult(-1);
            finish();
            return;
        }
        this.b.a(iax.f);
        h();
    }
}
