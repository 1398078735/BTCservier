package com.btc.connect;

import com.alibaba.fastjson.JSON;
import com.btc.connect.constants.Constants;
import com.btc.connect.result.Result;
import com.btc.connect.softutil.BlockChaininfo;
import com.sun.org.apache.bcel.internal.generic.JsrInstruction;
import org.apache.http.HttpStatus;
import java.util.HashMap;
import java.util.Map;

public class BTCService {
    private static Map<String ,String> map = new HashMap();
    static {
        map.put("Authorization","Basic "+ BcRPCUtils.base64Encode( Constants.RPCUSER+ ":" + Constants.RPCPASSWORD));
    }
    //获取比特币节点的区块总数
    public int getBlockCount(){
        String jsonStr = BcRPCUtils.prepareJSON("getblockcount");
        Result result =  BcRPCUtils.executePost(map,jsonStr);
        if (result.getCode()== HttpStatus.SC_OK) {
            String countStr = result.getData().getResult();
           return Integer.parseInt(countStr);
        }
        return -1;//查询失败
    }

    //获取最新区块的哈希
    public String getBestBlockHash(){
        String jsonStr = BcRPCUtils.prepareJSON("getbestblockhash");
        Result result =  BcRPCUtils.executePost(map,jsonStr);
        if (result.getCode()== HttpStatus.SC_OK) {
            return result.getData().getResult();
        }
        return null;//查询失败
    }

    //生成一个新的比特币地址
    public String getNewAddress(){
        String jsonStr = BcRPCUtils.prepareJSON("getnewaddress");
        Result result =  BcRPCUtils.executePost(map,jsonStr);
        if (result.getCode()== HttpStatus.SC_OK) {
            return result.getData().getResult();
        }
        return null;//查询失败
    }

    //获取当前比特币网络中的区块难度
    public int getDifficulty(){
        String jsonStr = BcRPCUtils.prepareJSON("getdifficulty");
        Result result =  BcRPCUtils.executePost(map,jsonStr);
        if (result.getCode()== HttpStatus.SC_OK) {
            String countStr = result.getData().getResult();
            return Integer.parseInt(countStr);
        }
        return -1;//查询失败
    }

    //通过区块的哈希值去获取区块数据
    public String getBlockByHash(){
        String jsonStr = BcRPCUtils.prepareJSON("getblock","000000000019d6689c085ae165831e934ff763ae46a2a6c172b3f1b60a8ce26f");
        Result result =  BcRPCUtils.executePost(map,jsonStr);
        if (result.getCode()== HttpStatus.SC_OK) {
            return result.getData().getResult();
        }
        return null;//查询失败
    }

    //获取区块链信息
    public String getBlockChainInfo(){
        String jsonStr = BcRPCUtils.prepareJSON("getblockchaininfo");
        Result result =  BcRPCUtils.executePost(map,jsonStr);
        if (result.getCode()== HttpStatus.SC_OK) {
            return result.getData().getResult();
        }
        return null;//查询失败
    }

    //获取钱包的信息
    public Object getWalletInfo(){
        String jsonStr = BcRPCUtils.prepareJSON("getwalletinfo");
        Result result =  BcRPCUtils.executePost(map,jsonStr);
        if (result.getCode()== HttpStatus.SC_OK) {
            return result.getData().getResult();
        }
        return null;//查询失败
    }

    //创建一个交易
    public String createRawtranSaction(){
        String jsonStr = BcRPCUtils.prepareJSON("createrawtransaction");
        Result result =  BcRPCUtils.executePost(map,jsonStr);
        if (result.getCode()== HttpStatus.SC_OK) {
            return result.getData().getResult();
        }
        return null;//查询失败
    }

    //发送一个交易
    public String sendRawtranSaction(){
        String jsonStr = BcRPCUtils.prepareJSON("sendrawtransaction");
        Result result =  BcRPCUtils.executePost(map,jsonStr);
        if (result.getCode()== HttpStatus.SC_OK) {
            return result.getData().getResult();
        }
        return null;//查询失败
    }

    //签名一个交易
    public String signRawtranSaction(){
        String jsonStr = BcRPCUtils.prepareJSON("signrawtransaction");
        Result result =  BcRPCUtils.executePost(map,jsonStr);
        if (result.getCode()== HttpStatus.SC_OK) {
            return result.getData().getResult();
        }
        return null;//查询失败
    }


    //获取某个高度的哈希值
    public String getBlockHashByHeight(){
        String jsonStr = BcRPCUtils.prepareJSON("getblockhash",0);
        Result result =  BcRPCUtils.executePost(map,jsonStr);
        if (result.getCode()== HttpStatus.SC_OK) {
            return result.getData().getResult();
        }
        return null;//查询失败
    }

    //获取所有命令
    public String getBlockCommand(){
        String jsonStr = BcRPCUtils.prepareJSON("help");
        Result result =  BcRPCUtils.executePost(map,jsonStr);
        if (result.getCode()== HttpStatus.SC_OK) {
            return result.getData().getResult();
        }
        return null;//查询失败
    }

//        == Blockchain ==
//    getbestblockhash
//    getblock "blockhash" ( verbosity )
//    getblockchaininfo
//            getblockcount
//    getblockfilter "blockhash" ( "filtertype" )
//    getblockhash height
//    getblockheader "blockhash" ( verbose )
//    getblockstats hash_or_height ( stats )
//    getchaintips
//    getchaintxstats ( nblocks "blockhash" )
//    getdifficulty
//    getmempoolancestors "txid" ( verbose )
//    getmempooldescendants "txid" ( verbose )
//    getmempoolentry "txid"
//    getmempoolinfo
//    getrawmempool ( verbose )
//    gettxout "txid" n ( include_mempool )
//    gettxoutproof ["txid",...] ( "blockhash" )
//    gettxoutsetinfo
//    preciousblock "blockhash"
//    pruneblockchain height
//    savemempool
//    scantxoutset "action" ( [scanobjects,...] )
//    verifychain ( checklevel nblocks )
//    verifytxoutproof "proof"
//
//            == Control ==
//    getmemoryinfo ( "mode" )
//    getrpcinfo
//    help ( "command" )
//    logging ( ["include_category",...] ["exclude_category",...] )
//    stop
//            uptime
//
//== Generating ==
//    generatetoaddress nblocks "address" ( maxtries )
//    generatetodescriptor num_blocks "descriptor" ( maxtries )
//
//            == Mining ==
//    getblocktemplate ( "template_request" )
//    getmininginfo
//    getnetworkhashps ( nblocks height )
//    prioritisetransaction "txid" ( dummy ) fee_delta
//    submitblock "hexdata" ( "dummy" )
//    submitheader "hexdata"
//
//            == Network ==
//    addnode "node" "command"
//    clearbanned
//    disconnectnode ( "address" nodeid )
//    getaddednodeinfo ( "node" )
//    getconnectioncount
//            getnettotals
//    getnetworkinfo
//    getnodeaddresses ( count )
//    getpeerinfo
//            listbanned
//    ping
//    setban "subnet" "command" ( bantime absolute )
//    setnetworkactive state
//
//== Rawtransactions ==
//    analyzepsbt "psbt"
//    combinepsbt ["psbt",...]
//    combinerawtransaction ["hexstring",...]
//    converttopsbt "hexstring" ( permitsigdata iswitness )
//    createpsbt [{"txid":"hex","vout":n,"sequence":n},...] [{"address":amount},{"data":"hex"},...] ( locktime replaceable )
//    createrawtransaction [{"txid":"hex","vout":n,"sequence":n},...] [{"address":amount},{"data":"hex"},...] ( locktime replaceable )
//    decodepsbt "psbt"
//    decoderawtransaction "hexstring" ( iswitness )
//    decodescript "hexstring"
//    finalizepsbt "psbt" ( extract )
//    fundrawtransaction "hexstring" ( options iswitness )
//    getrawtransaction "txid" ( verbose "blockhash" )
//    joinpsbts ["psbt",...]
//    sendrawtransaction "hexstring" ( maxfeerate )
//    signrawtransactionwithkey "hexstring" ["privatekey",...] ( [{"txid":"hex","vout":n,"scriptPubKey":"hex","redeemScript":"hex","witnessScript":"hex","amount":amount},...] "sighashtype" )
//    testmempoolaccept ["rawtx",...] ( maxfeerate )
//    utxoupdatepsbt "psbt" ( ["",{"desc":"str","range":n or [n,n]},...] )
//
//            == Util ==
//    createmultisig nrequired ["key",...] ( "address_type" )
//    deriveaddresses "descriptor" ( range )
//    estimatesmartfee conf_target ( "estimate_mode" )
//    getdescriptorinfo "descriptor"
//    signmessagewithprivkey "privkey" "message"
//    validateaddress "address"
//    verifymessage "address" "signature" "message"
//
//            == Wallet ==
//    abandontransaction "txid"
//    abortrescan
//    addmultisigaddress nrequired ["key",...] ( "label" "address_type" )
//    backupwallet "destination"
//    bumpfee "txid" ( options )
//    createwallet "wallet_name" ( disable_private_keys blank "passphrase" avoid_reuse )
//    dumpprivkey "address"
//    dumpwallet "filename"
//    encryptwallet "passphrase"
//    getaddressesbylabel "label"
//    getaddressinfo "address"
//    getbalance ( "dummy" minconf include_watchonly avoid_reuse )
//    getbalances
//    getnewaddress ( "label" "address_type" )
//    getrawchangeaddress ( "address_type" )
//    getreceivedbyaddress "address" ( minconf )
//    getreceivedbylabel "label" ( minconf )
//    gettransaction "txid" ( include_watchonly verbose )
//    getunconfirmedbalance
//            getwalletinfo
//    importaddress "address" ( "label" rescan p2sh )
//    importmulti "requests" ( "options" )
//    importprivkey "privkey" ( "label" rescan )
//    importprunedfunds "rawtransaction" "txoutproof"
//    importpubkey "pubkey" ( "label" rescan )
//    importwallet "filename"
//    keypoolrefill ( newsize )
//    listaddressgroupings
//    listlabels ( "purpose" )
//    listlockunspent
//    listreceivedbyaddress ( minconf include_empty include_watchonly "address_filter" )
//    listreceivedbylabel ( minconf include_empty include_watchonly )
//    listsinceblock ( "blockhash" target_confirmations include_watchonly include_removed )
//    listtransactions ( "label" count skip include_watchonly )
//    listunspent ( minconf maxconf ["address",...] include_unsafe query_options )
//    listwalletdir
//            listwallets
//    loadwallet "filename"
//    lockunspent unlock ( [{"txid":"hex","vout":n},...] )
//    removeprunedfunds "txid"
//    rescanblockchain ( start_height stop_height )
//    sendmany "" {"address":amount} ( minconf "comment" ["address",...] replaceable conf_target "estimate_mode" )
//    sendtoaddress "address" amount ( "comment" "comment_to" subtractfeefromamount replaceable conf_target "estimate_mode" avoid_reuse )
//    sethdseed ( newkeypool "seed" )
//    setlabel "address" "label"
//    settxfee amount
//    setwalletflag "flag" ( value )
//    signmessage "address" "message"
//    signrawtransactionwithwallet "hexstring" ( [{"txid":"hex","vout":n,"scriptPubKey":"hex","redeemScript":"hex","witnessScript":"hex","amount":amount},...] "sighashtype" )
//    unloadwallet ( "wallet_name" )
//    walletcreatefundedpsbt [{"txid":"hex","vout":n,"sequence":n},...] [{"address":amount},{"data":"hex"},...] ( locktime options bip32derivs )
//    walletlock
//    walletpassphrase "passphrase" timeout
//    walletpassphrasechange "oldpassphrase" "newpassphrase"
//    walletprocesspsbt "psbt" ( sign "sighashtype" bip32derivs )
//
//            == Zmq ==
//    getzmqnotifications

}
