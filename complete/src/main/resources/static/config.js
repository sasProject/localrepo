/**
 * Created by PARTH on 22/03/2015.
 */

Configuration = {
    useLocalData: true,
    environment: 'production',
    services: {
        local:{
            projectTreeServiceUrl: 'localdata/treedata.json',
            dataTreeServiceUrl: 'localdata/treedata.json'
        },
        production: {
            projectTreeServiceUrl: 'http://127.0.0.1:8090/projectnavigationtreerestservice',
            dataTreeServiceUrl: 'http://127.0.0.1:8090/datanavigationtreeservice'
        }
    }
}