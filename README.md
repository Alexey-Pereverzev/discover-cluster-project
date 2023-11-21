# discover-cluster-project

to work with graphql goto http://localhost:8080/graphiql

available queries:

# mutation {
#   connect(accessKey: "AKIAXOG53I4UVX3E4W4Q", 
#     secretKey: "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", 
#     clusterName: "vt-cluster", 
#     region:"eu-north-1") 
# }

# query {
#   discoverCluster {
#     name
#     deployments
#     pods
#     configMaps
#     secrets
#     ingresses
#   }
# }
  
# query {
# 	appByName(name : "videoteka-email-service") {
# 		name
# 		deployments
# 	}
# }
