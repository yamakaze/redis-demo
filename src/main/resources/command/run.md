start with persistent storage

    docker run --name redis_1 -p 6379:6379 -d redis redis-server --appendonly yes 

connecting via redis-cli (image id)

     docker exec -it 41362e714166 bash

     redis-cli


