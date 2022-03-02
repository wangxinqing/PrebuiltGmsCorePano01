package com.google.android.gms.googlehelp.contact.chat;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import com.google.android.gms.googlehelp.common.HelpConfig;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ChatSupportRequestFormChimeraActivity extends oiy {
    private EditText a;

    public final ofn i() {
        throw null;
    }

    public final oar j() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean a2 = ofy.a();
        int i = R.style.gh_ChatRequestFormDarkActivityStyle;
        if (a2) {
            ofy.a((Activity) this, this.x, (int) R.style.gh_ChatRequestFormLightActivityStyle, (int) R.style.gh_ChatRequestFormDarkActivityStyle, (int) R.style.gh_ChatRequestFormDayNightActivityStyle);
        } else {
            if (!ofy.a(this.x)) {
                i = R.style.gh_ChatRequestFormLightActivityStyle;
            }
            setTheme(i);
        }
        nzf.a(this, true);
        if (!ofq.a(axng.b())) {
            oay.a((Activity) this);
        } else {
            setRequestedOrientation(1);
        }
        String string = getString(R.string.gh_chat_request_form_activity_title);
        setTitle((CharSequence) string);
        sg aE = aE();
        if (aE != null) {
            aE.a((CharSequence) string);
        }
        setContentView((int) R.layout.gh_chat_request_form_activity);
        this.a = (EditText) findViewById(R.id.gh_chat_request_form_issue_description);
        TextView textView = (TextView) findViewById(R.id.gh_chat_request_form_account_email);
        Account account = this.x.d;
        if (account == null) {
            Log.e("gH_RTSuptClsfierAcvty", "Account is required for chat support.");
            finish();
            return;
        }
        textView.setText(String.format("%s: %s", new Object[]{getString(R.string.gh_request_as), account.name}));
        oay.a((TextView) findViewById(R.id.gh_application_info_and_privacy_policy), (oiy) this, avmt.CHAT);
        getWindow().setSoftInputMode(34);
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.gh_chat_support_request_form_activity_menu, menu);
        MenuItem findItem = menu.findItem(R.id.gh_chat_support_request_form_submit);
        findItem.setIcon(ofx.a((Context) this, ofy.b() ? ofy.a(this, R.attr.gh_primaryBlueColor) : kf.b(this, R.color.google_blue600)));
        new ocs(amzy.a((Object) this.a), findItem).a();
        return super.onCreateOptionsMenu(menu);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.gh_chat_support_request_form_submit) {
            return super.onOptionsItemSelected(menuItem);
        }
        HelpConfig helpConfig = this.x;
        helpConfig.y = this.a.getText().toString();
        odu.h(this, helpConfig);
        ChatRequestAndConversationChimeraService.a((Context) this, helpConfig, true);
        startActivity(ChatConversationChimeraActivity.a(this, this.x));
        okg.a((nzu) this, 21, avmt.CHAT);
        finish();
        return true;
    }
}
