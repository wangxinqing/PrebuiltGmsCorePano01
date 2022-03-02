package com.google.android.gms.auth.account.be;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.smartdevice.setup.accounts.Assertion;
import com.google.android.gms.smartdevice.setup.accounts.Challenge;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CreateBootstrapAssertionIntentOperation extends IntentOperation {
    private static final iwd a = ehv.a("CreateBootstrapAssertionIntentOperation");
    private achf b;

    public CreateBootstrapAssertionIntentOperation() {
    }

    private static final Message a(Exception exc, String str) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        return a(str);
    }

    public final void onCreate() {
        ibq ibq = abmq.a;
        this.b = abmq.a(this);
    }

    public final void onHandleIntent(Intent intent) {
        Message message;
        Messenger messenger = (Messenger) intent.getExtras().get("messenger");
        if (messenger == null) {
            a.d("Missing a messenger, unable to bootstrap", new Object[0]);
            return;
        }
        try {
            if ("com.google.android.gms.auth.account.be.create_bootstrap_assertion".equals(intent.getAction())) {
                Account account = (Account) intent.getParcelableExtra("bootstrapAccount");
                if (account != null) {
                    try {
                        UserBootstrapInfo[] userBootstrapInfoArr = (UserBootstrapInfo[]) acws.a(this.b.a(new Account[]{account}));
                        if (userBootstrapInfoArr != null) {
                            if (userBootstrapInfoArr.length > 0) {
                                try {
                                    Challenge[] challengeArr = (Challenge[]) acws.a(this.b.a(userBootstrapInfoArr));
                                    if (challengeArr != null) {
                                        if (challengeArr.length > 0) {
                                            try {
                                                Assertion[] assertionArr = (Assertion[]) acws.a(this.b.a(challengeArr, false, true));
                                                if (assertionArr != null) {
                                                    if (assertionArr.length > 0) {
                                                        try {
                                                            ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest = (ExchangeAssertionsForUserCredentialsRequest) acws.a(this.b.a(assertionArr));
                                                            if (exchangeAssertionsForUserCredentialsRequest != null) {
                                                                try {
                                                                    ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest2 = (ExchangeAssertionsForUserCredentialsRequest) acws.a(this.b.a(exchangeAssertionsForUserCredentialsRequest));
                                                                    if (exchangeAssertionsForUserCredentialsRequest2 != null) {
                                                                        message = Message.obtain((Handler) null, 1);
                                                                        Bundle bundle = new Bundle();
                                                                        bundle.putByteArray("bootstrapAssertion", ivy.a(exchangeAssertionsForUserCredentialsRequest2));
                                                                        message.setData(bundle);
                                                                    } else {
                                                                        message = a("Error populating source device info");
                                                                    }
                                                                } catch (ExecutionException e) {
                                                                    e = e;
                                                                    message = a(e, "Error calling api to populate source device info");
                                                                    messenger.send(message);
                                                                    return;
                                                                } catch (InterruptedException e2) {
                                                                    e = e2;
                                                                    message = a(e, "Error calling api to populate source device info");
                                                                    messenger.send(message);
                                                                    return;
                                                                }
                                                            } else {
                                                                message = a("Error generating partial request.");
                                                            }
                                                        } catch (ExecutionException e3) {
                                                            e = e3;
                                                            message = a(e, "Error calling api to generate partial request");
                                                            messenger.send(message);
                                                            return;
                                                        } catch (InterruptedException e4) {
                                                            e = e4;
                                                            message = a(e, "Error calling api to generate partial request");
                                                            messenger.send(message);
                                                            return;
                                                        }
                                                        messenger.send(message);
                                                        return;
                                                    }
                                                }
                                                message = a("No assertions");
                                            } catch (ExecutionException e5) {
                                                e = e5;
                                                message = a(e, "Error calling api to get assertions");
                                                messenger.send(message);
                                                return;
                                            } catch (InterruptedException e6) {
                                                e = e6;
                                                message = a(e, "Error calling api to get assertions");
                                                messenger.send(message);
                                                return;
                                            }
                                            messenger.send(message);
                                            return;
                                        }
                                    }
                                    message = a("No challenges");
                                } catch (ExecutionException e7) {
                                    e = e7;
                                    message = a(e, "Error calling api to get challenges");
                                    messenger.send(message);
                                    return;
                                } catch (InterruptedException e8) {
                                    e = e8;
                                    message = a(e, "Error calling api to get challenges");
                                    messenger.send(message);
                                    return;
                                }
                                messenger.send(message);
                                return;
                            }
                        }
                        message = a("No bootstrap infos");
                    } catch (ExecutionException e9) {
                        e = e9;
                        message = a(e, "Error calling api to get bootstrap info");
                        messenger.send(message);
                        return;
                    } catch (InterruptedException e10) {
                        e = e10;
                        message = a(e, "Error calling api to get bootstrap info");
                        messenger.send(message);
                        return;
                    }
                    messenger.send(message);
                    return;
                }
                messenger.send(a("No bootstrap account"));
                return;
            }
            messenger.send(a("Unknown action"));
        } catch (RemoteException e11) {
            a.e("Exception sending message: ", e11, new Object[0]);
        }
    }

    CreateBootstrapAssertionIntentOperation(achd achd, achf achf) {
        this.b = achf;
    }

    private static final Message a(String str) {
        Message obtain = Message.obtain((Handler) null, 1001);
        Bundle bundle = new Bundle();
        bundle.setClassLoader(CreateBootstrapAssertionIntentOperation.class.getClassLoader());
        bundle.putString("errorMsg", str);
        obtain.setData(bundle);
        return obtain;
    }
}
