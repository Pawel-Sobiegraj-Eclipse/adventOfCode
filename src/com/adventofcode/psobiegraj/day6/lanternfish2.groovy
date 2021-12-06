timers = [3,1,4,2,1,1,1,1,1,1,1,4,1,4,1,2,1,1,2,1,3,4,5,1,1,4,1,3,3,1,1,1,1,3,3,1,3,3,1,5,5,1,1,3,1,1,2,1,1,1,3,1,4,3,2,1,4,3,3,1,1,1,1,5,1,4,1,1,1,4,1,4,4,1,5,1,1,4,5,1,1,2,1,1,1,4,1,2,1,1,1,1,1,1,5,1,3,1,1,4,4,1,1,5,1,2,1,1,1,1,5,1,3,1,1,1,2,2,1,4,1,3,1,4,1,2,1,1,1,1,1,3,2,5,4,4,1,3,2,1,4,1,3,1,1,1,2,1,1,5,1,2,1,1,1,2,1,4,3,1,1,1,4,1,1,1,1,1,2,2,1,1,5,1,1,3,1,2,5,5,1,4,1,1,1,1,1,2,1,1,1,1,4,5,1,1,1,1,1,1,1,1,1,3,4,4,1,1,4,1,3,4,1,5,4,2,5,1,2,1,1,1,1,1,1,4,3,2,1,1,3,2,5,2,5,5,1,3,1,2,1,1,1,1,1,1,1,1,1,3,1,1,1,3,1,4,1,4,2,1,3,4,1,1,1,2,3,1,1,1,4,1,2,5,1,2,1,5,1,1,2,1,2,1,1,1,1,4,3,4,1,5,5,4,1,1,5,2,1,3]
numberOfDays = 256
fishMap = new HashMap<Integer, BigDecimal>()

initializeFishMap()

println fishMap
for(int i = 0; i <numberOfDays; i++)
{
    tempMap = initializeNewMap()
    for(index in fishMap.keySet())
    {
        if(index == 0)
        {
            tempMap.put(8, fishMap.get(index))
            tempMap.put(6, fishMap.get(index))
        }
        else
        {
            tempMap.put(index-1, tempMap.get(index-1).add(fishMap.get(index)))
        }
    }
    fishMap = tempMap
}

BigDecimal countFish = 0
for(index in fishMap.keySet())
{
    countFish = countFish.add(fishMap.get(index))
}

println(countFish)

void initializeFishMap()
{
    count0 = 0;
    count1 = 0;
    count2 = 0;
    count3 = 0;
    count4 = 0;
    count5 = 0;

    for(int i =0; i<timers.size(); i++)
    {
        switch(timers[i])
        {
            case 0:
                count0++
                break
            case 1:
                count1++
                break
            case 2:
                count2++
                break
            case 3:
                count3++
                break
            case 4:
                count4++
                break
            case 5:
                count5++
                break
        }
    }

    fishMap.put(0, new BigDecimal(count0))
    fishMap.put(1, new BigDecimal(count1))
    fishMap.put(2, new BigDecimal(count2))
    fishMap.put(3, new BigDecimal(count3))
    fishMap.put(4, new BigDecimal(count4))
    fishMap.put(5, new BigDecimal(count5))
    fishMap.put(6, new BigDecimal(0))
    fishMap.put(7, new BigDecimal(0))
    fishMap.put(8, new BigDecimal(0))
}

Map<Integer, BigDecimal> initializeNewMap()
{
    newMap = new HashMap<Integer, BigDecimal>()
    newMap.put(0, new BigDecimal(0))
    newMap.put(1, new BigDecimal(0))
    newMap.put(2, new BigDecimal(0))
    newMap.put(3, new BigDecimal(0))
    newMap.put(4, new BigDecimal(0))
    newMap.put(5, new BigDecimal(0))
    newMap.put(6, new BigDecimal(0))
    newMap.put(7, new BigDecimal(0))
    newMap.put(8, new BigDecimal(0))

    return newMap
}